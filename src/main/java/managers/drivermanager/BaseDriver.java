package managers.drivermanager;

import managers.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.AfterClass;

public class BaseDriver {

    private static Logger log = Logger.getLogger(BaseDriver.class);

    @AfterClass
    public static void tearDown() {
        WebDriverManager.driver.close();
        WebDriverManager.driver.quit();
        log.info("driver is off");
    }
}
