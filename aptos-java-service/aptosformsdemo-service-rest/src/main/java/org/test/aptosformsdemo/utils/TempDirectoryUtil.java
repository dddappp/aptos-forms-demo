package org.test.aptosformsdemo.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempDirectoryUtil {

    public static final Path SYSTEM_TEMP_DIR_PATH = Paths.get(System.getProperty("java.io.tmpdir"));
    public static final long MAX_TEMP_DIRECTORY_SIZE = 500 * 1024 * 1024;
    private static final String TEMP_DIR_PREFIX = "MOVE_FORMS_";
    private static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000;

    private TempDirectoryUtil() {
    }


    public static void cleanUpOldTempDirectories() throws IOException {
        long currentTime = System.currentTimeMillis();
        try (Stream<Path> stream = Files.list(SYSTEM_TEMP_DIR_PATH)) {
            stream.filter(Files::isDirectory)
                    .filter(path -> path.getFileName().toString().startsWith(TEMP_DIR_PREFIX))
                    .filter(path -> {
                        try {
                            return (currentTime - Files.getLastModifiedTime(path).toMillis()) > ONE_DAY_IN_MILLIS;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return false;
                        }
                    })
                    .collect(Collectors.toList())
                    .forEach(path -> {
                        try {
                            //System.out.println("Deleting directory: " + path.toString());
                            deleteDirectory(path);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }

    private static void deleteDirectory(Path path) throws IOException {
        Files.walk(path)
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(File::delete);
    }

    public static long calculatorTempDirectorySize(Path startPath, boolean breakIfOverSize) {
        AtomicLong size = new AtomicLong(0);
        try (Stream<Path> stream = Files.list(startPath)) {
            stream.filter(Files::isDirectory)
                    .filter(path -> {
                        if (breakIfOverSize && size.get() > MAX_TEMP_DIRECTORY_SIZE) {
                            return false;
                        }
                        return path.getFileName().toString().startsWith(TEMP_DIR_PREFIX);
                    })
                    .flatMap(path -> {
                        try {
                            return Files.walk(path);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return Stream.empty();
                        }
                    })
                    .filter(Files::isRegularFile)
                    .forEach(path -> {
                        size.addAndGet(getFileSize(path));
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return size.get();
    }

    private static long getFileSize(Path path) {
        try {
            return Files.size(path);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /*
    public static void main(String[] args) throws IOException {
        Path tempDirectory_1 = Files.createTempDirectory(TEMP_DIR_PREFIX);
        System.out.println("Temp directory 1: " + tempDirectory_1.toString());
        // Create some random files in the temp directory
        Path f_1 = Files.createTempFile(tempDirectory_1, "tempFile1", ".txt");
        // Write some content to the file
        Files.write(f_1, "Hello, World!".getBytes());
        Path f_2 = Files.createTempFile(tempDirectory_1, "tempFile2", ".txt");
        Files.write(f_2, "Hello, World2!".getBytes());
        Path f_3 = Files.createTempFile(tempDirectory_1, "tempFile3", ".txt");
        Files.write(f_3, "Hello, World3!".getBytes());

        Path tempDirectory_2 = Files.createTempDirectory(TEMP_DIR_PREFIX);
        System.out.println("Temp directory 2: " + tempDirectory_2.toString());
        long tempDirectorySize = calculatorTempDirectorySize(SYSTEM_TEMP_DIR_PATH, false);
        System.out.println("Temp directory size: " + tempDirectorySize);
        long tempDirectorySize_2 = calculatorTempDirectorySize(SYSTEM_TEMP_DIR_PATH, true);
        System.out.println("Temp directory size2: " + tempDirectorySize_2);

        // Clean up the temp directory after operations
        if (tempDirectorySize_2 > MAX_TEMP_DIRECTORY_SIZE) {
            System.out.println("Temp directory size is over the limit, cleaning up...");
            cleanUpOldTempDirectories();
        }
    }
     */
}
