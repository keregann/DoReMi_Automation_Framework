package com.endava.framework.manager;

import com.endava.framework.dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static WebDriverManager webDriverManager = new WebDriverManager();
    public static WebDriver driver;
    private static String driverType;

    private WebDriverManager() {
        driverType = ConfigFileReader.getInstance().getBrowser();
    }

    public static WebDriver createDriver() {
        switch (driverType) {
            case "chrome":
                System.setProperty(CHROME_DRIVER_PROPERTY, ConfigFileReader.getInstance().getDriverPath());
                driver = new ChromeDriver();
                break;
            case "ie":
                System.setProperty(IE_DRIVER_PROPERTY, ConfigFileReader.getInstance().getDriverPath());
                driver = new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(ConfigFileReader.getInstance().getApplicationUrl());
        driver.manage().timeouts().implicitlyWait(ConfigFileReader.getInstance().getImplicitlyWait(), TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
