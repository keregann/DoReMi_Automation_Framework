package com.endava.framework.pageObject;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class MyProfilePage extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";

    @FindBy(xpath = "//input[@placeholder='Phone']")
    private WebElement phone;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    private WebElement confirmPassword;

    @FindBy(xpath = "//input[@placeholder='Address']")
    private WebElement address;

    @FindBy(xpath = "//input[@placeholder='Address 2']")
    private WebElement address2;

    @FindBy(xpath = "//input[@placeholder='City']")
    private WebElement city;

    @FindBy(xpath = "//input[@placeholder='State/Region']")
    private WebElement stateRegion;

    @FindBy(xpath = "//input[@placeholder='Postal/Zip Code']")
    private WebElement postalZipCode;

    @FindBy(xpath = "//span[contains(text(),'Select Country')]")
    private WebElement selectCountry;

    @FindBy(xpath = "//button[@class='btn btn-block updateprofile btn-primary']")
    private WebElement submitButton;
}
