package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AdminLoginPage extends BasePage {
    private final String url = "https://www.phptravels.net/admin";


    @FindBy(xpath = "//body/div/form[@class='form-signin form-horizontal wow fadeIn animated animated']/div/label[1]/input[1]")
    private WebElement email;

    @FindBy(xpath = "//div//label[@class='input-outlined']//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block ladda-button fadeIn animated btn-lg']")
    private WebElement loginButton;

};