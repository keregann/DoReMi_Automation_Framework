package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class UserAccountPage extends BasePage {
    private final String url = "https://www.phptravels.net/account/";

    @FindBy(xpath = "//h3[@class='text-align-left']")
    private WebElement userAccountPage;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    private WebElement logOut;

    @FindBy(xpath = "//a[@class='go-text-right nav-link']")
    private WebElement newsletter;

    @FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")
    private WebElement myAccount;

    @FindBy(xpath = "//a[contains(text(),'Hotels')]")
    private WebElement hotels;

}
