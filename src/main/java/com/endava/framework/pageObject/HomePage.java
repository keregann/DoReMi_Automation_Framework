package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class HomePage extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";

    @FindBy(xpath = "//a[contains(text(),'Hotels')]")
    private WebElement hotels;

    @FindBy(xpath = "//a[contains(text(),'Visa')]")
    private WebElement visa;

    @FindBy(xpath = "(//a[@id='dropdownCurrency'])[2]")
    private WebElement myAccount;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    private WebElement logInButton;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    private WebElement signUp;

    @FindBy(xpath = "//a[contains(@class,'text-center flights')]")
    private WebElement flightsTab;

    @FindBy(xpath = "//a[contains(@class,'text-center tours')]")
    private WebElement toursTab;

    @FindBy(xpath = "//h2[contains(text(),'Featured Tours')]")
    private WebElement featuredTours;

    @FindBy(xpath = "//div[@class='col']//span//span")
    private List<WebElement> featuredToursOptions;
}
