package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class LoginPage extends Page {

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//label[@class='custom-control-label']")
    WebElement chekBoxRememberMe;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block loginbtn']")
    WebElement loginButton;

    @FindBy(xpath = "//a[@class='btn btn-success br25 btn-block form-group']")
    WebElement singUpButton;

    @FindBy(xpath = "//a[@class='btn btn-warning br25 btn-block']")
    WebElement forgotPasswordButton;

//    public void inputData(String email, String password) {
//        log.print("you was in inputData method");
//        this.email.sendKeys(email);
//        this.password.sendKeys(password);
//    }

//    public void clickChekBoxRememberMe() {
//        chekBoxRememberMe.click();
//    }
//
//    public void clickLoginButton() {
//        loginButton.click();
//    }
//
//    public void clickSingUpButton() {
//        singUpButton.click();
//    }
//
//    public void clickForgotPasswordButton() {
//        forgotPasswordButton.click();
//    }
}
