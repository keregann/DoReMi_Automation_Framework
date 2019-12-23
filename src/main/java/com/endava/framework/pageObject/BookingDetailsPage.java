package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class BookingDetailsPage extends BasePage {
    private final String url = "https://www.phptravels.net/thhotels/checkout/";

    @FindBy(xpath = "//select[@id='title']")
    private WebElement title;

    @FindBy(xpath = "//select[@id='title']//option")
    private List<WebElement> titleOptions;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@id='country_code_chosen']")
    private WebElement country;

    @FindBy(xpath = "//div[@id='country_code_chosen']//li")
    private List<WebElement> countryOptions;

    @FindBy(xpath = "//div[2]/div[2]/input[1]")
    private WebElement email;

    @FindBy(xpath = "//input[@id='phone_number']")
    private WebElement phone;

    @FindBy(xpath = "//div[2]/form[2]/button[1]")
    private WebElement completeBooking;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement warningMessage;
}
