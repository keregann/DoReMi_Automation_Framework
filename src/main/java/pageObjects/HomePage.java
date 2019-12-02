package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class HomePage extends Page {

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homePage;

    @FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")
    WebElement myAccount;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    WebElement logIn;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    WebElement singUp;

    //
    public void clickMyAccount() {
        myAccount.click();
    }

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
