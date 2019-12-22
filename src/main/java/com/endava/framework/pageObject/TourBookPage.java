package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class TourBookPage extends BasePage {
    private final String url = "https://www.phptravels.net/tours/book/";

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstname;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastname;

    @FindBy(xpath = "//div[@class='col-md-6 col-12 o2']//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Confirm Email']")
    WebElement confirm;
}
