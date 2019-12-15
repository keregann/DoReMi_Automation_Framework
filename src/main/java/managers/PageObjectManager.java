package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SignUpPage;
import pageObjects.UserAccountPage;

public class PageObjectManager {
    private WebDriver driver;

    private BasePage basePage;
    private HomePage homePage;
    private LoginPage loginPage;
    private UserAccountPage userAccountPage;
    private SignUpPage signUpPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {//Base page abstract
        return (homePage == null) ? homePage = new HomePage() : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    public UserAccountPage getUserAccountPage() {
        return (userAccountPage == null) ? userAccountPage = new UserAccountPage() : userAccountPage;
    }

    public SignUpPage getSignUpPage() {
        return (signUpPage == null) ? signUpPage = new SignUpPage() : signUpPage;
    }
    public BasePage getBasePage() {//Base page abstract
        return (basePage == null) ? basePage = new BasePage() : basePage;
    }

}