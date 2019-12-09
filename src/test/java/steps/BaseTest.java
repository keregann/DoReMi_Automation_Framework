package steps;

import driver.Singleton;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

    @BeforeClass
    public static void setUp(){
        Singleton.initialize();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        Singleton.quit();
    }
}
