package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SignUpPage extends BasePage {
    private final String url = "https://www.phptravels.net/register";

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    private WebElement mobileNumber;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    private WebElement confirm;

    @FindBy(xpath = "//button[contains(text(),' Sign Up')]")
    private WebElement signUp;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement warningMessage;
}
