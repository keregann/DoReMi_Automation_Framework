package cucumber.stepdefs.stepdefsMargarita;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivermanager.BaseDriver;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserAccountPage;


public class StepdefsMargarita extends BaseDriver {
    UserAccountPage account = new UserAccountPage();
    LoginPage login = new LoginPage();
    HomePage home = new HomePage();

    @Given("^user is on the Home Page$")
    public void user_is_on_the_Home_Page() {
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/");
        Assert.assertEquals("PHPTRAVELS | Travel Technology Partner", driver.getTitle());
    }

    @When("^user choose My Account menu$")
    public void userChooseMyAccountMenu() {
        home.getMyAccount().click();
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
        System.out.println("2");
    }

    @And("^user is redirected to Account Page$")
    public void userIsRedirectedToAccountPage() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("3");

    }

    @And("^click on My Account dropdown$")
    public void clickOnMyAccountDropdown() throws InterruptedException {
        Thread.sleep(3000);
        account.getUser().click();
    }

    @And("^click on Logout options$")
    public void clickOnLogoutOptions() {
        account.getLogOut().click();
    }

    @And("^user is redirected to Home Page$")
    public void userIsRedirectedToHomePage() {


    }
}
