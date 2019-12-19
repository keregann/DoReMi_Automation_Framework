package cucumber.stepdefs;

import com.endava.doremi_automation_framework.manager.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.endava.doremi_automation_framework.util.ScreenShotsMaker.makeDir;

public class Hooks {
    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

    private static Logger log = Logger.getLogger(Hooks.class);

    @Before
    public void BeforeSteps(Scenario scenario) {
        log.info("-----Start of scenario-----");
        WebDriverManager.createDriver();
        makeDir(scenario.getName());
    }

    @After
    public void AfterSteps() {
        log.info("-----End of scenario-----");
        WebDriverManager.closeDriver();
    }
}