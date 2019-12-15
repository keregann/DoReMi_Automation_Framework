package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HotelDetailsPage extends BasePage {

    @FindBy(xpath = "//a[text() = 'See price and date']")
    private WebElement seePriceAndDate;

    //the first from list
    @FindBy(xpath = "//div[@class='room-item-wrapper']//div[2]//div[1]//div[2]//div[1]//div[2]//form[1]//button[1]")
    private WebElement bookNowButton;

}

