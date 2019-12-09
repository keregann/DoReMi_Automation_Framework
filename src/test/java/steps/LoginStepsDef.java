package steps;

import cucumber.api.java.en.*;
import driver.Singleton;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStepsDef extends BaseTest {
    private LoginPage loginPage = new LoginPage();

    @Given("^the 'Login' page is displayed$")
    public void theLoginPageIsDisplayed() {
        loginPage.goToLoginPage();
        Assert.assertEquals("Login", Singleton.driver.getTitle());
    }

    @Given("User enters Email as '(.*)' and Password as '(.*)'")
    public void userEntersEmailAndPassword(String email, String password) {
        loginPage.inputData(email,password);
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
