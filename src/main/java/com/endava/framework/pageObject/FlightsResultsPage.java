package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class FlightsResultsPage extends BasePage {
    private final String url = "https://www.phptravels.net/";

    @FindBy(xpath = "//div[@class='theme-search-results-item-book']//button[@type='submit']")
    private WebElement bookNowButton;

    @FindBy(xpath = "//span[@class='irs-slider from']")
    private WebElement fromSlider;

    @FindBy(xpath = "//span[@class='irs-slider to']")
    private WebElement toSlider;

    @FindBy(xpath = "//span[contains(text(),'Air Moldova')]")
    private WebElement airMoldovaCheckbox;
}
