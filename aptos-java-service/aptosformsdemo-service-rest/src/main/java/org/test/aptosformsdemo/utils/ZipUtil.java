package org.test.aptosformsdemo.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipUtil {
    private ZipUtil() {
    }

    public static void unzip(String zipFilePath, String destDirPath) throws IOException {
        unzip(new File(zipFilePath), new File(destDirPath));
    }

    public static void unzip(File zipFile, File destDir) throws IOException {
        try (ZipInputStream zis = new ZipInputStream(Files.newInputStream(zipFile.toPath()))) {
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                File newFile = newFile(destDir, zipEntry);
                if (zipEntry.isDirectory()) {
                    if (!newFile.isDirectory() && !newFile.mkdirs()) {
                        throw new IOException("Failed to create directory " + newFile);
                    }
                } else {
                    // Create all parent directories
                    File parent = newFile.getParentFile();
                    if (!parent.isDirectory() && !parent.mkdirs()) {
                        throw new IOException("Failed to create directory " + parent);
                    }
                    // Write the file to disk
                    try (FileOutputStream fos = new FileOutputStream(newFile)) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, len);
                        }
                    }
                }
                zipEntry = zis.getNextEntry();
            }
            zis.closeEntry();
        }
    }

    private static File newFile(File destDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destDir, zipEntry.getName());

        String destDirPath = destDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();

        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Entry is outside of the destination directory: " + zipEntry.getName());
        }

        return destFile;
    }

    public static void zipSpecifiedContents(String sourceDirPath, String zipFilePath,
                                             String[] includes
    ) throws IOException {
        Path zipFile = Files.createFile(Paths.get(zipFilePath));
        try (ZipOutputStream zs = new ZipOutputStream(Files.newOutputStream(zipFile))) {
            Path sourceDir = Paths.get(sourceDirPath);
            for (String include : includes) {
                Path includePath = sourceDir.resolve(include);
                if (Files.isDirectory(includePath)) {
                    // If it is a directory, only include the files under the directory
                    Files.walk(includePath, 1) // Note that 1 here limits the depth of traversal
                            .filter(path -> !Files.isDirectory(path)) // Exclude subdirectories
                            .forEach(path -> {
                                try {
                                    pack(path, sourceDir, zs);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            });
                } else {
                    // If it is a file, add it directly
                    pack(includePath, sourceDir, zs);
                }
            }
        }
    }

    private static void pack(Path file, Path sourceDir, ZipOutputStream zs) throws IOException {
        String zipEntryName = sourceDir.relativize(file).toString();
        ZipEntry zipEntry = new ZipEntry(zipEntryName);
        zs.putNextEntry(zipEntry);
        Files.copy(file, zs);
        zs.closeEntry();
    }

    // Get the extraction subdirectory path
    public static String getExtractionSubdirectoryPath(String destDirPath, String zipFilePath) {
        // Handle whether there is a file separator at the end
        String destDir = destDirPath;
        if (!destDir.endsWith(File.separator)) {
            destDir += File.separator;
        }
        // Get the file name without the extension
        String fileName = new File(zipFilePath).getName();
        int indexOfDot = fileName.lastIndexOf('.');
        String baseName = (indexOfDot == -1) ? fileName : fileName.substring(0, indexOfDot);
        // If the file name does not end with .zip, use the file name as the base name
        if (!fileName.endsWith(".zip")) {
            baseName = fileName;
        }

        Path subDirPath = Paths.get(destDir).resolve(baseName);
        return subDirPath.toString();
    }


    /*
     public static void main(String[] args) throws IOException {
         String zipFilePath = "/Users/xxx/Downloads/Generated_2.zip";
         String destDirPath = "/Users/xxx/Downloads";
         String extractionSubdirectoryPath = getExtractionSubdirectoryPath(destDirPath, zipFilePath);
         unzip(zipFilePath, extractionSubdirectoryPath);
     }
     */
}
