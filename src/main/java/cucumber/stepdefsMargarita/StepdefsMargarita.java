package cucumber.stepdefsMargarita;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.stepdefs.BaseTest;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserAccountPage;


public class StepdefsMargarita extends BaseTest {
    UserAccountPage account = new UserAccountPage();
    LoginPage login = new LoginPage();
    HomePage home = new HomePage();

    @Given("^user is on the Home Page$")
    public void user_is_on_the_Home_Page() {
        System.out.println("123");
    }

    @When("^user choose My Account menu$")
    public void userChooseMyAccountMenu() {
        home.clickMyAccount();
    }

    @And("^user choose Login$")
    public void userChooseLogin() {
        home.getLogIn().click();
    }

    @And("user enter valid '(.*)' and '(.*)'")
    public void userEnterValidEmailAndPassword(String email, String password) {
        login.getEmail().sendKeys(email);
        login.getPassword().sendKeys(password);
    }

    @And("^click on LOGIN button$")
    public void clickOnLOGINButton() {
        login.getLoginButton().click();
    }

    @Then("^user are logged$")
    public void userAreLogged() {
    }

    @And("^user is redirected to Account Page$")
    public void userIsRedirectedToAccountPage() {

    }

    @And("^click on My Account dropdown$")
    public void clickOnMyAccountDropdown() {
        account.getAccount().click();
    }

    @And("^click on Logout options$")
    public void clickOnLogoutOptions() {
        account.getLogOut().click();
    }

    @And("^user is redirected to Home Page$")
    public void userIsRedirectedToHomePage() {
    }
}
