package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AdminPanelPage extends BasePage {
    private final String url = "https://www.phptravels.net/admin";

    @FindBy(xpath = "//a[contains(text(),'Accounts')]")
    private WebElement accounts;

    @FindBy(xpath = "//ul[@id='ACCOUNTS']//li[3]//a[1]")
    private WebElement customers;
}
