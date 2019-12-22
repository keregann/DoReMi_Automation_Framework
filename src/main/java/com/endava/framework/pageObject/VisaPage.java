package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class VisaPage extends BasePage {
    private final String url = "https://www.phptravels.net/visa";

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Confirm Email']")
    private WebElement confirmMail;

    @FindBy(xpath = "//input[@placeholder='Contact Number']")
    private WebElement contactNumber;

    @FindBy(xpath = "//input[@placeholder='Date']")
    private WebElement date;

    @FindBy(xpath = "//button[@id='sub']")
    private WebElement submit;
}
