package dataProviders;

import enums.DriverType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ConfigFileReader {
    private final String propertyFilePath = "src/main/resources/application.properties";
    private Properties properties;
    private static ConfigFileReader configFileReader = new ConfigFileReader();

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));// reads the property file
            properties = new Properties();// creates a new Properties object
            try {
                properties.load(reader);// pushes the property file into it
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("application.properties not found at " + propertyFilePath);
        }
    }

    public static ConfigFileReader getInstance() {
        return configFileReader;
    }

    public String getDriverPath(DriverType driverType) {
        String driverPath;
        switch (driverType) {
            case CHROME:
                driverPath = properties.getProperty("chromeDriverPath");
                break;
            case IE:
                driverPath = properties.getProperty("ieDriverPath");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + driverType);
        }
        if (driverPath != null) return driverPath;
        else
            throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) {
            try {
                return Long.parseLong(implicitlyWait);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
            }
        }
        return 30;
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null) return url;
        else
            throw new RuntimeException("Application Url not specified in the application.properties file for the Key:url");
    }

    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if (browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if (browserName.equalsIgnoreCase("ie")) return DriverType.IE;
        else
            throw new RuntimeException("Browser Name Key value in application.properties is not matched : " + browserName);
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if (windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }
}
