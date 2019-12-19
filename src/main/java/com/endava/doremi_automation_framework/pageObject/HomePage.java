package com.endava.doremi_automation_framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";

    @FindBy(xpath = "(//a[@id='dropdownCurrency'])[2]")
    private WebElement myAccount;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    private WebElement logInButton;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    private WebElement signUp;

    @FindBy(xpath = "//a[contains(@class,'text-center flights')]")
    private WebElement flightsTab;
}
