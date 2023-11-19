package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    private static final Properties config = new Properties();

    public static void loadAllProperties() {
        try {
            String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            FileInputStream Locator;
            Locator = new FileInputStream(rootPath + "config.properties");
            config.load(Locator);
        } catch (IOException e) {
            System.out.println("Could not load properties : " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return config.getProperty(key);
    }

}
