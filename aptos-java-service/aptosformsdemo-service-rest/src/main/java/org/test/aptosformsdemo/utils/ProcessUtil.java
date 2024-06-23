package org.test.aptosformsdemo.utils;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class ProcessUtil {
    private ProcessUtil() {
    }

    public static int compileMove(
            String aptosCliPath,
            String packageDirPath,
            Map<String, String> namedAddresses,
            String logFilePath
    ) throws IOException, InterruptedException {
        // String logFilePath = "/tmp/aptos-move-compile.log";
        StringBuilder namedAddressesList = new StringBuilder();
        for (Map.Entry<String, String> entry : namedAddresses.entrySet()) {
            if (namedAddressesList.length() > 0) {
                namedAddressesList.append(",");
            }
            namedAddressesList.append(entry.getKey()).append("=").append(entry.getValue());
        }
        String[] command = {
                aptosCliPath,//"aptos"
                "move", "compile",
                "--save-metadata",
                "--skip-fetch-latest-git-deps",
                "--included-artifacts none",
                "--package-dir", packageDirPath,
                "--named-addresses", namedAddressesList.toString()
        };
        return executeProcess(command, logFilePath);
    }

    // Execute process and log it
    private static int executeProcess(String[] command, String logFilePath) throws IOException, InterruptedException {
        // Process command and arguments
        //String[] command = {"your_command", "arg1", "arg2"};
        // Base path of log file
        //String logFilePath = "/path/to/log";
        // Use StringBuilder to collect output
        StringBuilder output = new StringBuilder();

        ProcessBuilder processBuilder = new ProcessBuilder(command);
        // Redirect error output to standard output
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append(System.lineSeparator());
        }

        int exitCode = process.waitFor();
        // Determine the name of the log file based on the exit code of the process?
        //String logFileName = exitCode == 0 ? "output.log" : "error.log";
        try (FileWriter fileWriter = new FileWriter(logFilePath)) {//new File(logFilePath, logFileName))) {
            fileWriter.write(output.toString());
        }
        //System.out.println("Exit code: " + exitCode);
        return exitCode;
    }

    //
    // For example
    // aptos move compile --save-metadata --skip-fetch-latest-git-deps \
    //   --package-dir /mydapp
    //   --named-addresses aptos_forms_demo2=0x71df3ab1b6cf015aa5870a8a6e8ee0951c54e8d7d79bb59fa3b737c3a38fb93b,xrender_form_utils=0x71df3ab1b6cf015aa5870a8a6e8ee0951c54e8d7d79bb59fa3b737c3a38fb93b
    //
    /*
    public static void main(String[] args) {
        try {
            String aptosCliPath = "/Users/yangjiefeng/.cargo/bin/aptos";
            String packageDirPath = "/Users/yangjiefeng/Documents/wubuku/aptos-form-demo2";
            Map<String, String> namedAddresses = new HashMap<>();
            namedAddresses.put("aptos_forms_demo2", "0x71df3ab1b6cf015aa5870a8a6e8ee0951c54e8d7d79bb59fa3b737c3a38fb93b");
            namedAddresses.put("xrender_form_utils", "0x71df3ab1b6cf015aa5870a8a6e8ee0951c54e8d7d79bb59fa3b737c3a38fb93b");

            String logFilePath = "/Users/yangjiefeng/Documents/wubuku/aptos-form-demo2/aptos-move-compile.log";
            int exitCode = compileMove(aptosCliPath, packageDirPath, namedAddresses, logFilePath);
            System.out.println("Exit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
     */
}
