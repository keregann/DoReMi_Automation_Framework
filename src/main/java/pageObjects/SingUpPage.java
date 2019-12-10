package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class SingUpPage extends Page {

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")
    WebElement singUpButton;

    public void enterUserData(String firstName, String lastName, String mobileNumber, String email, String password) {
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.mobileNumber.sendKeys(mobileNumber);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(password);
    }

    public void click() {
        singUpButton.click();
    }
}
