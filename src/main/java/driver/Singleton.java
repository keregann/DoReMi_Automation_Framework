package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Singleton {
    public static WebDriver driver = null;

    public static WebDriver initialize() {
        System.out.println("Initializing browser...");
        //Singleton pattern
        if (driver == null) {
            if (Constants.browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/ChromeDriver/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (Constants.browserName.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "src/resources/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else if (Constants.browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");
                driver = new InternetExplorerDriver();
            }
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Constants.url);
        return driver;
    }

    public static void quit() {
        System.out.println("quit the browser...");
        driver.quit();
        driver = null;
    }

    public static void close() {
        System.out.println("close the browser...");
        driver.close();
        driver = null;
    }
}
