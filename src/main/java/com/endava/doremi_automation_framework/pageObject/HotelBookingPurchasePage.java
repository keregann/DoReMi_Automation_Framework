package com.endava.doremi_automation_framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HotelBookingPurchasePage {
    private final String url = "https://www.phptravels.net/index.php";
    @FindBy(xpath = "//span[contains(text(),'Purchase')]")
    private WebElement purchaseLabel;

}
