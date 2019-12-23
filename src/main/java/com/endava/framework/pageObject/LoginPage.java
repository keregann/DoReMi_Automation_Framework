package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage {
    private final String url = "https://www.phptravels.net/login";

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block loginbtn']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@class='btn btn-success br25 btn-block form-group']")
    private WebElement singUpButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement warningMessage;

}
