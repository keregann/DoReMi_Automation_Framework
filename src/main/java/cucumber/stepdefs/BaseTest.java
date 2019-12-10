package cucumber.stepdefs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import utils.DriverFactory;

public class BaseTest {

    @BeforeClass
    public static void setUp() {
        DriverFactory.initialize();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        DriverFactory.quit();
    }
}
