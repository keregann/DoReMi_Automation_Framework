package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class TourBookPage extends BasePage {
    private final String url = "https://www.phptravels.net/tours/book/";

    @FindBy(xpath = "//span[contains(text(),'Personal Details')]")
    private WebElement personalDetails;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstname;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastname;

    @FindBy(xpath = "//div[@class='col-md-6 col-12 o2']//input[@placeholder='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Confirm Email']")
    private WebElement confirm;

    @FindBy(xpath = "//input[@placeholder='Contact Number']")
    private WebElement mobile;

    @FindBy(xpath = "//input[@placeholder='Address']")
    private WebElement address;

    @FindBy(xpath = "//span[contains(text(),'Select Country')]")
    private WebElement country;

    @FindBy(xpath = "//div[@class='chosen-drop']//ul//li[@class='active-result']")
    private List<WebElement> countryOptions;

    @FindBy(xpath = "//form[@id='guestform']//div//label//span[@class='slider round']")
    private WebElement slider;

    @FindBy(xpath = "//div[@id='special']//textarea")
    private WebElement textField;

    @FindBy(xpath = "//span[contains(text(),'Coupon Code')]")
    private WebElement couponCode;

    @FindBy(xpath = "//input[@placeholder='Coupon Code']")
    private WebElement code;

    @FindBy(xpath = "//div[@class='col-md-4']//input[@name='passport[1][name]']")
    private WebElement guest1Name;

    @FindBy(xpath = "//div[@class='col-md-6']//input[@name='passport[1][passportnumber]']")
    private WebElement guest1Passport;

    @FindBy(xpath = "//div[@class='col-md-2']//input[@name='passport[1][age]']")
    private WebElement guest1Age;

    @FindBy(xpath = "//div[@class='col-md-4']//input[@name='passport[2][name]']")
    private WebElement guest2Name;

    @FindBy(xpath = "//div[@class='col-md-6']//input[@name='passport[2][passportnumber]']")
    private WebElement guest2Passport;

    @FindBy(xpath = "//div[@class='col-md-2']//input[@name='passport[2][age]']")
    private WebElement guest2Age;

    @FindBy(xpath = "//button[@name='guest']")
    private WebElement confirmThisBookingButton;

    @FindBy(xpath = "//div[@class='result']//div//p")
    private WebElement warningMessage;
}
