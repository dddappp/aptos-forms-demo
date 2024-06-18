package org.test.aptosformsdemo.utils;

import okhttp3.*;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;

import static org.test.aptosformsdemo.utils.StringUtil.getSafeFormId;
import static org.test.aptosformsdemo.utils.StringUtil.toUnderscoreCase;

public class ProjectCreationUtil {
    public static final String FORM_SCHEMA_FILES_FIELD_NAME = "files";
    public static final String DEFAULT_GENERATED_ZIP_NAME = "Generated.zip";

    public static void createContractProject(
            OkHttpClient client,
            String serviceUrl,
            File[] formSchemaFiles,
            String formId,
            Map<String, String> creationOptions,
            String saveDirectory
    ) throws IOException {
        if (formId == null || formId.isEmpty()) {
            throw new IllegalArgumentException("formId is required.");
        }
        formId = getSafeFormId(formId);
        creationOptions.put("xRenderFormId", formId);
        if (!creationOptions.containsKey("boundedContextAptosPackageName")) {
            creationOptions.put("boundedContextAptosPackageName", formId);
        }
        fixProjectCreationOptions(creationOptions);

        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (File file : formSchemaFiles) {
            builder.addFormDataPart(FORM_SCHEMA_FILES_FIELD_NAME, file.getName(), RequestBody.create(file, MediaType.parse("application/octet-stream")));
        }
        for (Map.Entry<String, String> entry : creationOptions.entrySet()) {
            builder.addFormDataPart(entry.getKey(), entry.getValue());
        }

        RequestBody requestBody = builder.build(); // Build the request body
        // Build the request
        Request request = new Request.Builder().url(serviceUrl).post(requestBody).build();
        // Send the request
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected HTTP code: " + response);
            File saveFile = getSaveFile(saveDirectory, response);
            try (Sink sink = Okio.sink(saveFile); BufferedSink bufferedSink = Okio.buffer(sink)) {
                bufferedSink.writeAll(Objects.requireNonNull(response.body()).source());
            }
        }
    }

    // Fix the creationOptions, if necessary.
    private static void fixProjectCreationOptions(Map<String, String> creationOptions) {
        String aptosPackageName = creationOptions.get("boundedContextAptosPackageName");
        if (!creationOptions.containsKey("boundedContextName")) {
            creationOptions.put("boundedContextName", "Dddml." + aptosPackageName);
        }
        if (!creationOptions.containsKey("aptosMoveProjectDirectoryPath")) {
            creationOptions.put("aptosMoveProjectDirectoryPath", ".");
        }
        if (!creationOptions.containsKey("boundedContextAptosNamedAddress")) {
            String aptosNamedAddress = toUnderscoreCase(aptosPackageName);
            creationOptions.put("boundedContextAptosNamedAddress", aptosNamedAddress);
        }
        if (!creationOptions.containsKey("xRenderFormUpdatable")) {
            creationOptions.put("xRenderFormUpdatable", "true");
        }
        if (!creationOptions.containsKey("xRenderFormStartPageName")) {
            creationOptions.put("xRenderFormStartPageName", "StartPage");
        }
        if (!creationOptions.containsKey("pomGroupId")) {
            creationOptions.put("pomGroupId", "org.dddml." + aptosPackageName.toLowerCase());
        }
        //creationOptions.put("xRenderFormOpenAt", "2023-11-06T07:36:54Z");
        //creationOptions.put("xRenderFormCutoffAt", "2093-11-08T07:36:54+08:00");
        if (!creationOptions.containsKey("noJavaProjects")) {
            creationOptions.put("noJavaProjects", "true");
        }
        if (!creationOptions.containsKey("boundedContextJavaPackageName")) {
            creationOptions.put("boundedContextJavaPackageName", "org.dddml." + aptosPackageName.toLowerCase());
        }
        if (!creationOptions.containsKey("javaProjectNamePrefix")) {
            creationOptions.put("javaProjectNamePrefix", aptosPackageName.toLowerCase());
        }
        if (!creationOptions.containsKey("javaProjectsDirectoryPath")) {
            creationOptions.put("javaProjectsDirectoryPath", "aptos-java-service");
        }
    }


    private static File getSaveFile(String saveDirectory, Response response) {
        String contentDisposition = response.header("Content-Disposition");
        String saveFileName = DEFAULT_GENERATED_ZIP_NAME;
        if (contentDisposition != null && contentDisposition.contains("filename=")) {
            // System.out.println("contentDisposition: " + contentDisposition);
            // for example: attachment; filename=Generated.zip; filename*=UTF-8''Generated.zip
            String[] parts = contentDisposition.split(";");
            for (String part : parts) {
                if (part.trim().startsWith("filename=")) {
                    saveFileName = part.substring(part.indexOf("filename=") + 9).replace("\"", "");
                    break;
                }
            }
        }
        String saveFilePath = Paths.get(saveDirectory, saveFileName).toString();
        // Check if the file exists, if it does, change the file name
        File saveFile = new File(saveFilePath);
        if (saveFile.exists()) {
            int dotIndex = saveFileName.lastIndexOf('.');
            String baseName = (dotIndex == -1) ? saveFileName : saveFileName.substring(0, dotIndex);
            String extension = (dotIndex == -1) ? "" : saveFileName.substring(dotIndex);
            String newFileName = baseName + "-2" + extension;
            saveFilePath = Paths.get(saveDirectory, newFileName).toString();
            saveFile = new File(saveFilePath);
        }
        return saveFile;
    }

    /*
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        String serviceUrl = "http://localhost:5271/ProjectTools/CreateProject";
        File[] formSchemaFiles = new File[]{
                new File("/Users/xxx/Documents/wubuku/aptos-form-demo2/form-schema/form2.json")
        };
        String aptosPackageName = "AptosFormsDemo2";
        Map<String, String> creationOptions = new HashMap<>();
        String saveDirectory = "/Users/xxx/Downloads";
        createContractProject(client, serviceUrl, formSchemaFiles, aptosPackageName, creationOptions, saveDirectory);
    }
     */
}
