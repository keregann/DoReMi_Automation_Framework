package cucumber.stepdefs.stepdefsMargarita;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on the Home Page$")
    public void user_is_on_Home_Page() {
        homePage.goToHomePage();
    }

    @When("^user clicks My Account menu$")
    public void userClicksMyAccountMenu() {
        homePage.getMyAccount().click();
    }

    @And("^user clicks Login$")
    public void userClicksLogin() {
        homePage.getLogIn().click();
    }
}
