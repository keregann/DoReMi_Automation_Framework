package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class UserAccountPage extends BasePage {

    @FindBy(xpath = "//h3[@class='text-align-left']")
    WebElement userAccountPage;

    @FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")
    WebElement myAccount;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    WebElement logOut;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    WebElement account;

    @FindBy(xpath = "//a[@class='nav-link go-text-right active']")
    WebElement bookings;

    @FindBy(xpath = "//a[contains(text(),'My Profile')]")
    WebElement myProfile;

    @FindBy(xpath = "//a[contains(text(),'Wishlist')]")
    WebElement wishList;

    @FindBy(xpath = "//a[@class='go-text-right nav-link']")
    WebElement newsletter;
}
