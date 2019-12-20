package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HotelDetailsPage extends BasePage {
    private final String url = "https://www.phptravels.net/thhotels/detail/";

    @FindBy(xpath = "//a[@class='anchor btn btn-primary btn-wide mt-5']")
    private WebElement seePriceAndDateButton;

    //the first from list
    @FindBy(xpath = "//div[@class='room-item-wrapper']//div[2]//div[1]//div[2]//div[1]//div[2]//form[1]//button[1]")
    private WebElement bookNowButton;

    //input[@class='select2-input']

    //input[@id='checkin']

    //input[@id='checkout']

}

