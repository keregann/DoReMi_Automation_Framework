package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class HotelsPage extends BasePage {

    private final String url = "https://www.phptravels.net/thhotels/";

    @FindBy(xpath = "//div[@id='listing']//li")
    private List<WebElement> hotels;

    @FindBy(xpath = "//li[1]//button[contains(text(),'Details')]")
    private WebElement detailsButton;

}
