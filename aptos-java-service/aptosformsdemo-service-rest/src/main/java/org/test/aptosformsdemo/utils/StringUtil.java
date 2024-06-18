package org.test.aptosformsdemo.utils;

public class StringUtil {
    private StringUtil() {
    }

    // To snake_case
    public static String toUnderscoreCase(String aptosPackageName) {
        return aptosPackageName.replaceAll("([a-z0-9])([A-Z])", "$1_$2").toLowerCase();
    }

    public static String getSafeFormId(String formId) {
        return formId.replace("-", "_")
                .replace(".", "_")
                .replace(" ", "_");
    }
}
