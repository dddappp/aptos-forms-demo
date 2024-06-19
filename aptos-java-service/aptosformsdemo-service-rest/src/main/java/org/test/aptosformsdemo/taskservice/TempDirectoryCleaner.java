package org.test.aptosformsdemo.taskservice;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.test.aptosformsdemo.utils.TempDirectoryUtil;

import java.io.IOException;

@Component
public class TempDirectoryCleaner {

    private static final long ONE_MINUTE_IN_MILLIS = 60 * 1000;

    @Scheduled(cron = "0 0/10 * * * ?")
    public void cleanTempDirectory() throws IOException {
        TempDirectoryUtil.cleanUpOldTempDirectories(null);
        long size = TempDirectoryUtil.calculatorTempDirectorySize(true);
        if (size > TempDirectoryUtil.MAX_TEMP_DIRECTORY_SIZE) {
            TempDirectoryUtil.cleanUpOldTempDirectories(ONE_MINUTE_IN_MILLIS);
        }
    }
}
