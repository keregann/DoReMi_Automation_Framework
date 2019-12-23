package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class AddCustomerPage extends BasePage {
    private final String url = "https://www.phptravels.net/admin/accounts/customers/add";

    @FindBy(xpath = "//label[contains(text(),'First Name')]")
    private WebElement addCustomer;

    @FindBy(xpath = "//input[@placeholder='First name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    private WebElement mobile;

    @FindBy(xpath = "//span[contains(@class,'select2-chosen')]")
    private WebElement country;

    @FindBy(xpath = "//select[@name='country']//option")
    private List<WebElement> countryOptions;

    @FindBy(xpath = "//div[8]//div[1]//input[1]")
    private WebElement address1;

    @FindBy(xpath = "//div[9]//div[1]//input[1]")
    private WebElement address2;

    @FindBy(xpath = "//select[contains(@name,'status')]")
    private WebElement status;

    @FindBy(xpath = "//select[contains(@name,'status')]//option")
    private List<WebElement> statusOptions;

    @FindBy(xpath = "//input[contains(@name,'newssub')]")
    private WebElement subscribe;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
    private WebElement submitButton;
}
