package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class VisaConfirmationPage extends BasePage {
    private final String url = "https://www.phptravels.net/visa/confirmation";

    @FindBy(xpath = "//strong[contains(text(),'Visa Submitted')]")
    private WebElement visaSubmited;
}
