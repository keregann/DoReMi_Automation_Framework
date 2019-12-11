package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage extends BasePage {
    //first in list
    @FindBy(xpath = "//li[1]//div[1]//div[1]//div[2]//div[1]//div[3]//div[1]//div[2]//form[1]//button[1]")
    private WebElement detailsButton;

    //must to implement to choose from list by name
    public HotelsPage clickSeeHotelDetails() {
        detailsButton.click();
        return this;
    }
}
