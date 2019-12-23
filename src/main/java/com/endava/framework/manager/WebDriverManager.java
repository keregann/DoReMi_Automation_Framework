package com.endava.framework.manager;

import com.endava.framework.dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


public class WebDriverManager {
    private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
    public static WebDriver driver;

    private WebDriverManager() {
    }

    public static void createDriver() {
        ConfigFileReader configFileReader = ConfigFileReader.getInstance();
        String driverType = configFileReader.getBrowser();
        switch (driverType) {
            case "chrome":
                System.setProperty(CHROME_DRIVER_PROPERTY, configFileReader.getDriverPath());
                driver = new ChromeDriver();
                break;
            case "ie":
                System.setProperty(IE_DRIVER_PROPERTY, configFileReader.getDriverPath());
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                System.setProperty(FIREFOX_DRIVER_PROPERTY, configFileReader.getDriverPath());
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.navigate().to(configFileReader.getWebApplicationUrl());
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
