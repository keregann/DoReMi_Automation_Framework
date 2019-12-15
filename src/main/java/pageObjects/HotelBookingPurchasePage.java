package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HotelBookingPurchasePage {
    @FindBy(xpath = "//span[contains(text(),'Purchase')]")
    private WebElement purchaseLabel;

}
