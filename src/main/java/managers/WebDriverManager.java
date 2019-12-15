package managers;

import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static WebDriverManager webDriverManager = new WebDriverManager();
    public static WebDriver driver;
    private static DriverType driverType;
    private static int counter = 1;

    private WebDriverManager() {
        driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
    }

    public static WebDriver createDriver() {
        System.out.println("Driver before " + counter + " time " + "created :  ------ " + driver);
        switch (driverType) {
            case CHROME:
                System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath(driverType));
                driver = new ChromeDriver();
                counter++;
                break;
            case IE:
                System.setProperty(IE_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath(driverType));
                driver = new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver after closed:  ------" + driver);
        }
    }
}
