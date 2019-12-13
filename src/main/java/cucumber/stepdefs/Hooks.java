package cucumber.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

import javax.annotation.processing.Filer;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import static managers.WebDriverManager.driver;

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