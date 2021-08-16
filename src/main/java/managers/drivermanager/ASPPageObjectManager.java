package managers.drivermanager;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserAccountPage;
import pageObjects.asp.ASPHomePage;

public class ASPPageObjectManager {
    private WebDriver driver;

    private ASPHomePage homePage;
    private LoginPage loginPage;
    private UserAccountPage userAccountPage;

    public ASPPageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public ASPHomePage getHomePage() {
        return (homePage == null) ? homePage = new ASPHomePage() : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    public UserAccountPage getUserAccountPage() {
        return (userAccountPage == null) ? userAccountPage = new UserAccountPage() : userAccountPage;
    }

}