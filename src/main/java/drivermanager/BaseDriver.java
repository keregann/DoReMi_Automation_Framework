package drivermanager;

import drivermanager.DriverManager;
import drivermanager.DriverManagerFactory;
import drivermanager.DriverType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseDriver {
    public static WebDriver driver;
    private static DriverManager driverManager; //chrome Driver manager

    @Before
    public void setUp() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        System.out.println("Driver is on");
    }

    @After
    public void tearDown() {
        driverManager.quitDriver();
        System.out.println("driver is off");
    }
}
