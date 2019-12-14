package cucumber.stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;
import utils.ScreenShotsMaker;

public class Hooks {
    @Before
    public void BeforeSteps(Scenario scenario) {
        System.out.println("Before scenario...");
        WebDriverManager.createDriver();
        ScreenShotsMaker.makeDir(scenario.getName());
    }

    @After
    public void AfterSteps() {
        System.out.println("After scenario ...");
        WebDriverManager.closeDriver();
    }
}