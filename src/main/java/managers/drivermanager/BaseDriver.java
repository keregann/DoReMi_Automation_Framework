package managers.drivermanager;

import managers.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseDriver {

    @AfterClass
    public static void tearDown() {
        WebDriverManager.driver.close();
        WebDriverManager.driver.quit();
        System.out.println("driver is off");
    }
}
