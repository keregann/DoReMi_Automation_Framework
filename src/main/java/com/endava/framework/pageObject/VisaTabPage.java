package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class VisaTabPage extends BasePage {
    private final String url = "https://www.phptravels.net/";

    @FindBy(xpath = "//a[contains(text(),'Visa')]")
    private WebElement visa;

    @FindBy(xpath = "//div[@class='chosen-container chosen-container-single chosen-container-active']")
    private WebElement fromCountryField;

    @FindBy(xpath = "//select[@name='nationality_country']//option")
    private WebElement fromCountryFieldOptions;

    @FindBy(xpath = "//select[@name,'destination_country']")
    private WebElement toCountryField;

    @FindBy(xpath = "//select[@name,'destination_country']//option")
    private WebElement toCountryFieldOptions;

    @FindBy(xpath = " //input[contains(@placeholder,'Date')]")
    private WebElement date;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submit;
}
