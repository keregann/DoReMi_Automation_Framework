package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HotelsTabPage extends BasePage {
    private final String url = "https://www.phptravels.net/";

    @FindBy(xpath = "//a[@href='#hotels']")
    private WebElement hotels;

    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    private WebElement destination;

    @FindBy(xpath = "//input[@id='checkin']")
    private WebElement checkIn;

    @FindBy(xpath = "//input[@id='checkout']")
    private WebElement checkOut;

    @FindBy(xpath = "//div[contains(@class,'col o2')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
    private WebElement adults;

    @FindBy(xpath = "//div[contains(@class,'col 01')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
    private WebElement child;

    @FindBy(xpath = "//div[@class='col-md-2 col-xs-12 o1']//button[@class='btn btn-primary btn-block'][contains(text(),'Search')]")
    private WebElement search;

    @FindBy(xpath = "//li[@class='select2-no-results']")
    private WebElement noMatchesFound;

    @FindBy(xpath = "//div[@id='invalid_date")
    private WebElement invaliDate;
}
