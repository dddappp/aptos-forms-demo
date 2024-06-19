package org.test.aptosformsdemo.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileUtil {

    public static File[] convertMultipartFilesToFileArray(MultipartFile[] multipartFiles, String directoryPath) throws IOException {
        // Ensure the specified directory exists
        Path directory = Paths.get(directoryPath);
        if (!Files.exists(directory)) {
            Files.createDirectories(directory);
        }

        List<File> files = new ArrayList<>();
        for (MultipartFile multipartFile : multipartFiles) {
            if (multipartFile.isEmpty()) {
                continue; // Skip empty files
            }
            File file = new File(directory.toFile(), Objects.requireNonNull(multipartFile.getOriginalFilename()));
            try (OutputStream os = Files.newOutputStream(file.toPath())) {
                os.write(multipartFile.getBytes());
            }
            files.add(file);
        }
        return files.toArray(new File[0]);
    }
}