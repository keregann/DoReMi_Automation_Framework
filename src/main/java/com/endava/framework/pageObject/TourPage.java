package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class TourPage extends BasePage {
    private final String url = "https://www.phptravels.net/tours/";

    @FindBy(xpath = "//a[@class='anchor btn btn-primary btn-wide mt-5']")
    private WebElement descriptionButton;

    @FindBy(xpath = "//button[@class='btn btn-secondary btn-block mt-20 btn-action btn-lg loader']")
    private WebElement bookNowButton;
}
