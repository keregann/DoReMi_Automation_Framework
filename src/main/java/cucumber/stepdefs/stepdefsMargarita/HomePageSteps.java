package cucumber.stepdefs.stepdefsMargarita;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import pageObjects.HomePage;
import utils.ScreenShotsMaker;


import java.text.SimpleDateFormat;
import java.util.Date;

public class HomePageSteps {
    PageObjectManager pageObjectManager;
    HomePage homePage;

    public HomePageSteps() {
        pageObjectManager = new PageObjectManager(WebDriverManager.driver);
        homePage = pageObjectManager.getHomePage();
    }

    static {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }
    private static Logger log = Logger.getLogger(HomePageSteps.class);


    @Given("^user is on the '(.*)'$")
    public void user_is_on_Home_Page(String page) {
        homePage.goToHomePage();
        log.info(String.format("INFO LOG: User is on the %s", page));
        ScreenShotsMaker.screenshot();
    }

    @When("^user clicks '(.*)' menu$")
    public void userClicksMyAccountMenu(String menu) {
        homePage.getMyAccount().click();
        log.info(String.format("INFO LOG: User clicks on the %s", menu));
        ScreenShotsMaker.screenshot();
    }

    @And("^user clicks '(.*)' button$")
    public void userClicksLogin(String button) {
        homePage.getLogIn().click();
        log.info(String.format("INFO LOG: User clicks on the %s", button));
        ScreenShotsMaker.screenshot();
    }
}
