package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.stepdefs.BaseTest;
import org.junit.Assert;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginStepsDef extends BaseTest {
    private LoginPage loginPage = new LoginPage();

    @Given("^the 'Login' page is displayed$")
    public void theLoginPageIsDisplayed() {
        loginPage.goToLoginPage();
        Assert.assertEquals("Login", DriverFactory.driver.getTitle());
    }

    @Given("User enters Email as '(.*)' and Password as '(.*)'")
    public void userEntersEmailAndPassword(String email, String password) {
        loginPage.inputData(email, password);
    }

    @And("clicks 'Login' button")
    public void clicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("'My Account' page is displayed")
    public void myAccountPageIsDisplayed() {
        System.out.println("Account page");
    }
}
