package cucumber.stepdefs.stepdefsMargarita;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.UserAccountPage;

public class UserAccountPageSteps {
    PageObjectManager pageObjectManager;
    UserAccountPage userAccountPage;

    public UserAccountPageSteps() {
        pageObjectManager = new PageObjectManager(WebDriverManager.driver);
        userAccountPage = pageObjectManager.getUserAccountPage();
    }

    @Then("^Account Page is displayed$")
    public void userIsRedirectedToAccountPage() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("3");
    }

    @When("^user clicks on My Account dropdown$")
    public void clickOnMyAccountDropdown() throws InterruptedException {
        userAccountPage.getUser().click();
    }

    @And("^clicks on Logout link$")
    public void clickOnLogoutOptions() {
        userAccountPage.getLogOut().click();
    }
}
