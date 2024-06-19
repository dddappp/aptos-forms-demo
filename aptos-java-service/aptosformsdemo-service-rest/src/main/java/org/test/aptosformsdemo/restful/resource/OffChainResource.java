package org.test.aptosformsdemo.restful.resource;

import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.test.aptosformsdemo.utils.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.test.aptosformsdemo.utils.StringUtil.getSafeFormId;

@RequestMapping(path = "offChain")
@RestController
public class OffChainResource {
    private static final Logger logger = LoggerFactory.getLogger(OffChainResource.class);

    @Autowired
    private OkHttpClient okHttpClient;

    @Value("${dddappp.project-creation-service.url}")
    private String projectCreationServiceUrl;

    @Value("${aptos.cli.path}")
    private String aptosCliPath;

    @PostMapping("createContractAndCompile")
    public ResponseEntity<Resource> createContractAndCompile(
            @RequestParam("files") MultipartFile[] files,
            @RequestParam("formId") String formId,
            @RequestParam(required = false) String formOpenAt,
            @RequestParam(required = false) String formCutoffAt,
            @RequestParam(required = false) String formStartPageName,
            @RequestParam Map<String, String> allParams
    ) throws IOException, InterruptedException {
        // Filter specific parameters into namedAddresses
        Map<String, String> namedAddresses = allParams.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith("named_address__"))
                .collect(Collectors.toMap(
                        k -> k.getKey().substring("named_address__".length()),
                        Map.Entry::getValue
                ));
        String tempDir = TempDirectoryUtil.createTempDirectory();
        logger.info("Temp directory: {}", tempDir);
        Map<String, String> creationOptions = new HashMap<>();
        if (formOpenAt != null) {
            creationOptions.put("xRenderFormOpenAt", formOpenAt);
        }
        if (formCutoffAt != null) {
            creationOptions.put("xRenderFormCutoffAt", formCutoffAt);
        }
        if (formStartPageName != null) {
            creationOptions.put("xRenderFormStartPageName", formStartPageName);
        }
        formId = getSafeFormId(formId);
        String aptosPackageName = formId;
        File[] formSchemaFiles = FileUtil.convertMultipartFilesToFileArray(files, tempDir);
        File contractZipFile = ProjectCreationUtil.createContractProject(
                okHttpClient, projectCreationServiceUrl,
                formSchemaFiles,
                formId, aptosPackageName, creationOptions,
                tempDir
        );
        String extractionDir = ZipUtil.getExtractionSubdirectoryPath(tempDir, contractZipFile.getPath());
        ZipUtil.unzip(contractZipFile.getPath(), extractionDir);
        String compileLogFilePath = Paths.get(tempDir, "aptos-move-compile.log").toString();

        ProcessUtil.compileMove(aptosCliPath, extractionDir, namedAddresses, compileLogFilePath);

        Path metadataFilePath = Paths.get(extractionDir, "build", aptosPackageName, "package-metadata.bcs");
        File metadataFile = metadataFilePath.toFile();
        // Ensure the metadata file exists
        if (!metadataFile.exists()) {
            throw new IOException("Metadata file not found: " + metadataFile);
        }

        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(metadataFilePath));
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + metadataFile.getName() + "\""
                )
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }
}
