package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class FlightBookingPage extends BasePage {


    private final String url = "https://www.phptravels.net/thflights/checkout";

    @FindBy(xpath = "//span[contains(text(),'Billing Address')]")
    WebElement billingAddress;

    @FindBy(xpath = "//h6[contains(text(),'Payment Types')]")
    WebElement paymentTypes;

    @FindBy(xpath = "//select[@id='title']")
    WebElement title;

    @FindBy(xpath = "//select[@id='title']//option")
    List<WebElement> titleOptions;

    @FindBy(xpath = "//input[@id='name']")
    WebElement name;

    @FindBy(xpath = "//input[@id='surname']")
    WebElement surname;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement phone;

    @FindBy(xpath = "//input[@id='birthday']")
    WebElement birthday;

    @FindBy(xpath = "//input[@id='cardno']")
    WebElement passport;

    @FindBy(xpath = "//input[@id='expiration']")
    WebElement expirationDate;

    @FindBy(xpath = "//a[@class='select2-choice']")
    WebElement nationality;

    @FindBy(xpath = "//div[contains(text(),'MOLDOVA, REPUBLIC OF')]")
    WebElement nationalityOption;

    //Payment Types
    @FindBy(xpath = "//select[@id='cardtype']")
    WebElement cardType;

    @FindBy(xpath = "//select[@id='cardtype']//option")
    List<WebElement> cardTypeOptions;

    @FindBy(xpath = "//input[@id='card-number']")
    WebElement cardNumber;

    @FindBy(xpath = "//select[@id='expiry-month']")
    WebElement expiryMonth;

    @FindBy(xpath = "//select[@id='expiry-month']//option")
    List<WebElement> expiryMonthOptions;

    @FindBy(xpath = "//select[@id='expiry-year']")
    WebElement expiryYear;

    @FindBy(xpath = "//select[@id='expiry-year']//option")
    List<WebElement> expiryYearOptions;

    @FindBy(xpath = "//input[@id='cvv']")
    WebElement cvv;

    @FindBy(xpath = "//strong[@class='RTL go-right']")
    WebElement readTheTerms;

    //Confirmation
    @FindBy(xpath = "//label[contains(text(),'By clicking to complete this booking I acknowledge')]")
    WebElement acceptCheckBox;

    @FindBy(xpath = "//button[@id='confirmBooking']")
    WebElement availabilityCheckingButton;
}
