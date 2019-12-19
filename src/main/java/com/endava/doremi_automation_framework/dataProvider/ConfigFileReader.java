package com.endava.doremi_automation_framework.dataProvider;

import com.endava.doremi_automation_framework.enums.DriverType;
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
            log.error("Error throw: application.properties not found at " + propertyFilePath);
            log.error("Error catched: " + exception);
        }
    }

    public static ConfigFileReader getInstance() {
        return configFileReader;
    }

    public static boolean getScreenShotFlag() {
        return Boolean.parseBoolean(properties.getProperty("screenshot"));
    }

    public String getDriverPath(DriverType driverType) {
        switch (driverType) {
            case CHROME:
                return properties.getProperty("chromeDriverPath");
            case IE:
                return properties.getProperty("ieDriverPath");
            default:
                log.error("Driver Path not specified in the Configuration.properties file for the Key:driverPath");
                throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath");
        }
    }

    public long getImplicitlyWait() {
        return Long.parseLong(properties.getProperty("implicitlyWait"));
    }

    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if (browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if (browserName.equalsIgnoreCase("ie")) return DriverType.IE;
        else
            log.error("Browser Name Key value in application.properties is not matched : " + browserName);
        throw new RuntimeException("Browser Name Key value in application.properties is not matched : " + browserName);
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if (windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }

    public String getApplicationUrl() {
        return properties.getProperty("url");
    }
}
