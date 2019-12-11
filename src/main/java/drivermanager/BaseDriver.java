package drivermanager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseDriver {
    public static WebDriver driver;
    private static DriverManager driverManager; //chrome Driver manager

    @BeforeClass
    public static void setUp() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        System.out.println("Driver is on");
    }

    @AfterClass
    public static void tearDown() {
        driverManager.quitDriver();
        System.out.println("driver is off");
    }
}
