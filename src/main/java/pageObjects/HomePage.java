package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homePage;

    @FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")
    WebElement myAccount;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    WebElement logIn;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    WebElement singUp;

    @FindBy(xpath = "//a[contains(@class,'text-center flights')]")
    WebElement flightsTab;
}
