package cucumber.stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import utils.ScreenShotsMaker;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Hooks {
    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

    private static Logger log = Logger.getLogger(Hooks.class);

    @Before
    public void BeforeSteps(Scenario scenario) {
        log.info("Start of scenario");
        WebDriverManager.createDriver();
        // ScreenShotsMaker.makeDir(scenario.getName());
    }

    @After
    public void AfterSteps() {
        log.info("End of scenario");
        WebDriverManager.closeDriver();
    }
}