package com.endava.framework.dataProvider;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private final String propertyFilePath = "src/main/resources/application.properties";
    private static Properties properties;
    private static ConfigFileReader configFileReader = new ConfigFileReader();
    private static Logger log = Logger.getLogger(ConfigFileReader.class);

    public ConfigFileReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath))) {
            properties = new Properties();
            properties.load(reader);
        } catch (IOException exception) {
            exception.printStackTrace();
            log.error(exception.getStackTrace());
        }
    }

    public static ConfigFileReader getInstance() {
        return configFileReader;
    }

    public static boolean getScreenShotFlag() {
        return Boolean.parseBoolean(properties.getProperty("screenshot"));
    }

    public String getDriverPath() {
        switch (getBrowser()) {
            case "chrome":
                return properties.getProperty("chromeDriverPath");
            case "ie":
                return properties.getProperty("ieDriverPath");
            case "firefox":
                return properties.getProperty("firefoxDriverPath");
            default:
                log.error("Driver Path not specified in the Configuration.properties file for the Key:driverPath");
                return "Driver Path not specified in the Configuration.properties file for the Key:driverPath";
        }
    }

    public long getImplicitlyWait() {
        return Long.parseLong(properties.getProperty("implicitlyWait"));
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getPageObjectPath(){
        return properties.getProperty("pageObjectPath");
    }

    public String getApplicationUrl() {
        return properties.getProperty("url");
    }
}
