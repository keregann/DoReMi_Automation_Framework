package com.endava.framework.pageObject;

import com.endava.framework.manager.WebDriverManager;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BookingDetailsPage extends BasePage {
    private final String url = "https://www.phptravels.net/thhotels/checkout/";
    private WebDriver driver = WebDriverManager.driver;

    @FindBy(xpath = "//select[@id='title']")
    private WebElement titleField;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//div[2]/div[2]/input[1]")
    private WebElement email;

    @FindBy(xpath = "//input[@id='phone_number']")
    private WebElement phone;

    @FindBy(xpath = "//div[2]/form[2]/button[1]")
    private WebElement completeBookingButton;
}
