package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement homePage;

    @FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")
    private WebElement myAccount;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    private WebElement logIn;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    private WebElement signUp;

    @FindBy(xpath = "//a[contains(@class,'text-center flights')]")
    private WebElement flightsTab;
}
