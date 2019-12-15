package pageObjects;

import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SignUpPage extends BasePage {

    @FindBy(xpath = "//a[@class='collapse-link']")
    private WebElement signUpPage;

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
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")
    private WebElement signUp;
}
