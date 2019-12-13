package cucumber.stepdefs.stepdefsMargarita;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import pageObjects.LoginPage;

public class LoginPageSteps {
    PageObjectManager pageObjectManager;
    LoginPage loginPage;
    String s;

    public LoginPageSteps() {
        pageObjectManager = new PageObjectManager(WebDriverManager.driver);
        loginPage = pageObjectManager.getLoginPage();
    }

    private static Logger log = Logger.getLogger(HomePageSteps.class);

//    @Then("^'(.*)' Page is displayed$")
//    public void loginPageIsDisplayed(String page) {
//        log.info(String.format("INFO LOG: %s Page is displayed", page));
//    }

    @When("user enters '(.*)' as email and '(.*)' as password")
    public void userEnterValidEmailAndPassword(String email, String password) {
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password);
    }

    @And("^user clicks on '(.*)' button$")
    public void clickOnLoginButton(String button) {
        loginPage.getLoginButton().click();
        log.info(String.format("INFO LOG: User clicks on the %s", button));
    }

    @When("^user enter invalid valid '(.*)' and '(.*)'$")
    public void userEnterInvalidEmailAndPassword(String email, String password) {
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password);
    }

    @Then("^warning message is present on the page$")
    public void warningMessageIsPresentOnThePage() {
    }
}
