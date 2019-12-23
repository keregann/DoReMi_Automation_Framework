package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class FlightBookingPage extends BasePage {

    private final String url = "https://www.phptravels.net/thflights/checkout";

    @FindBy(xpath = "//span[contains(text(),'Billing Address')]")
    private WebElement billingAddress;

    @FindBy(xpath = "//h6[contains(text(),'Payment Types')]")
    private WebElement paymentTypes;

    @FindBy(xpath = "//select[@id='title']")
    private WebElement title;

    @FindBy(xpath = "//select[@id='title']//option")
    private List<WebElement> titleOptions;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement name;

    @FindBy(xpath = "//input[@id='surname']")
    private WebElement surname;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phone;

    @FindBy(xpath = "//input[@id='birthday']")
    private WebElement birthday;

    @FindBy(xpath = "//input[@id='cardno']")
    private WebElement passport;

    @FindBy(xpath = "//input[@id='expiration']")
    private WebElement expirationDate;

    @FindBy(xpath = "//select[@id='nationality']")
    private WebElement nationality;

    @FindBy(xpath = "//select[@id='nationality']//option")
    private List<WebElement> nationalityOptions;

    @FindBy(xpath = "//select[@id='cardtype']")
    private WebElement cardType;

    @FindBy(xpath = "//select[@id='cardtype']//option")
    private List<WebElement> cardTypeOptions;

    @FindBy(xpath = "//input[@id='card-number']")
    private WebElement cardNumber;

    @FindBy(xpath = "//select[@id='expiry-month']")
    private WebElement expiryMonth;

    @FindBy(xpath = "//select[@id='expiry-month']//option")
    private List<WebElement> expiryMonthOptions;

    @FindBy(xpath = "//select[@id='expiry-year']")
    private WebElement expiryYear;

    @FindBy(xpath = "//select[@id='expiry-year']//option")
    private List<WebElement> expiryYearOptions;

    @FindBy(xpath = "//input[@id='cvv']")
    private WebElement cvv;

    @FindBy(xpath = "//strong[@class='RTL go-right']")
    private WebElement readTheTerms;

    @FindBy(xpath = "//label[contains(text(),'By clicking to complete this booking I acknowledge')]")
    private WebElement acceptCheckBox;

    @FindBy(xpath = "//button[@id='confirmBooking']")
    private WebElement availabilityCheckingButton;
}
