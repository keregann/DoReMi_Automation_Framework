package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class UserAccountPage extends BasePage {

    @FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")
    WebElement user;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[2]")
    WebElement logOut;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    WebElement account;

    @FindBy(xpath = "//a[@class='nav-link go-text-right active']")
    WebElement bookings;

    @FindBy(xpath = "//a[contains(text(),'My Profile')]")
    WebElement myProfile;

    @FindBy(xpath = "//a[contains(text(),'Wishlist')]")
    WebElement wishlist;

    @FindBy(xpath = "//a[@class='go-text-right nav-link']")
    WebElement newsletter;
//
//    public void clickUser() throws InterruptedException {
//        Thread.sleep(3000);
//        user.click();
//    }

//    public void clickLogOut() {
//        logOut.click();
//    }
//
//    public void clickAccount() {
//        account.click();
//    }
}
