package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class TripInvoicePage extends BasePage {
    private final String url = "https://www.phptravels.net/invoice";

    @FindBy(xpath = "//h4[contains(text(),'Your booking status is Unpaid')]")
    private WebElement warningMessage;
}
