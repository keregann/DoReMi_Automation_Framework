package pageObjects;

import lombok.Data;
import managers.FileReaderManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homePage;

    @FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")
    WebElement myAccount;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    WebElement logIn;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    WebElement singUp;


    public void goToHomePage() {
        System.out.println("Home page is displayed");
    }


//    public void clickMyAccount() {
//        myAccount.click();
//    }
//
//    public void clickLogin() {
//        logIn.click();
//    }
//
//    public void clickSingUp() {
//        singUp.click();
//    }
//
//    public void getHomePage() {
//        homePage.click();
//    }
}
