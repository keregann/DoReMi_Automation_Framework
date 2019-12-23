package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CustomersPage extends BasePage {
    private final String url = "https://www.phptravels.net/admin/accounts/customers";

    @FindBy(xpath = "//button[contains(text(),'Add')]")
    private WebElement addButton;
}
