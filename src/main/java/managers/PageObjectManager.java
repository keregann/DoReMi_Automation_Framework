package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserAccountPage;

public class PageObjectManager {
    private WebDriver driver;

    private HomePage homePage;
    private LoginPage loginPage;
    private UserAccountPage userAccountPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage() : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    public UserAccountPage getUserAccountPage() {
        return (userAccountPage == null) ? userAccountPage = new UserAccountPage() : userAccountPage;
    }

}