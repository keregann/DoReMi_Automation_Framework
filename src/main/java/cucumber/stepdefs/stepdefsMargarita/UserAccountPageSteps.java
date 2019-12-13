package cucumber.stepdefs.stepdefsMargarita;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import pageObjects.UserAccountPage;

public class UserAccountPageSteps {
    PageObjectManager pageObjectManager;
    UserAccountPage userAccountPage;

    public UserAccountPageSteps() {
        pageObjectManager = new PageObjectManager(WebDriverManager.driver);
        userAccountPage = pageObjectManager.getUserAccountPage();
    }

    private static Logger log = Logger.getLogger(HomePageSteps.class);

    @Then("^'(.*)' Page is displayed$")
    public void userIsRedirectedToAccountPage(String page) throws InterruptedException {
        Thread.sleep(3000);
        log.info(String.format("INFO LOG: %s Page is displayed", page));
    }

    @When("^user clicks on '(.*)' menu$")
    public void clickOnMyAccountDropdown(String menu) {
        userAccountPage.getUser().click();
        log.info(String.format("INFO LOG: User clicks on the %s", menu));
    }

//    @And("^user clicks on '(.*)' button$")
//    public void clickOnLogoutOptions(String button) {
//        userAccountPage.getLogOut().click();
//        log.info(String.format("INFO LOG: User clicks on the %s", button));
//    }
}
