package cucumber.stepdefs.stepdefsMargarita;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginPageSteps {
    TestContext testContext;
    LoginPage loginPage;

    public LoginPageSteps(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Then("^Login Page is displayed$")
    public void loginPageIsDisplayed() {
    }

    @When("user enters '(.*)' as email and '(.*)' as password")
    public void userEnterValidEmailAndPassword(String email, String password) {
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password);
    }

    @And("^clicks on Login button$")
    public void clickOnLoginButton() {
        loginPage.getLoginButton().click();
    }
}
