package cucumber.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;

public class Hooks {

    @Before
    public void BeforeSteps() {
        System.out.println("Before scenario...");
        WebDriverManager.createDriver();
    }

    @After
    public void AfterSteps() {
        System.out.println("After scenario ...");
        WebDriverManager.closeDriver();
    }
}