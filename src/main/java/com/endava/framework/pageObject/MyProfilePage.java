package com.endava.framework.pageObject;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class MyProfilePage extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";

    @FindBy(xpath = "//input[@placeholder='Phone']")
    WebElement phone;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    WebElement confirmPassword;

    @FindBy(xpath = "//input[@placeholder='Address']")
    WebElement address;

    @FindBy(xpath = "//input[@placeholder='Address 2']")
    WebElement address2;

    @FindBy(xpath = "//input[@placeholder='City']")
    WebElement city;

    @FindBy(xpath = "//input[@placeholder='State/Region']")
    WebElement stateRegion;

    @FindBy(xpath = "//input[@placeholder='Postal/Zip Code']")
    WebElement postalZipCode;

    @FindBy(xpath = "//span[contains(text(),'Select Country')]")
    WebElement selectCountry;

    @FindBy(xpath = "//button[@class='btn btn-block updateprofile btn-primary']")
    WebElement submitButton;

    public void changePhone(String phone) {
        this.phone.sendKeys(phone);
    }

    public void changeEmail(String email) {
        this.email.sendKeys(email);
    }

    public void changePassword(String password) {
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(password);
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public void setAddress2(String address2) {
        this.address2.sendKeys(address2);
    }

    public void setCity(String city) {
        this.city.sendKeys(city);
    }

    public void setStateRegion(String stateRegion) {
        this.stateRegion.sendKeys(stateRegion);
    }

    public void setPostalZipCode(String postalZipCode) {
        this.postalZipCode.sendKeys(postalZipCode);
    }

    public void setSelectCountry(String selectCountry) {
        this.selectCountry.sendKeys(selectCountry);
    }

    public void submitChanges() {
        submitButton.click();
    }
}
