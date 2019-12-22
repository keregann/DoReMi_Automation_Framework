package com.endava.framework.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import static com.endava.framework.dataProvider.ConfigFileReader.getInstance;

public class WebDriverManager {
    private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
    private static WebDriverManager webDriverManager = new WebDriverManager();
    public static WebDriver driver;
    private static String driverType;

    private WebDriverManager() {
        driverType = getInstance().getBrowser();
    }

    public static WebDriver createDriver() {
        switch (driverType) {
            case "chrome":
                System.setProperty(CHROME_DRIVER_PROPERTY, getInstance().getDriverPath());
                driver = new ChromeDriver();
                break;
            case "ie":
                System.setProperty(IE_DRIVER_PROPERTY, getInstance().getDriverPath());
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                System.setProperty(FIREFOX_DRIVER_PROPERTY, getInstance().getDriverPath());
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.navigate().to(getInstance().getWebApplicationUrl());
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(getInstance().getImplicitlyWait(), TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
