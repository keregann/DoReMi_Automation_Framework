package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage {

    @FindBy(xpath = "//a[@class='collapse-link']")
    private WebElement loginPage;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//label[@class='custom-control-label']")
    private WebElement checkBoxRememberMe;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block loginbtn']")
    private WebElement login;

    @FindBy(xpath = "//a[@class='btn btn-success br25 btn-block form-group']")
    private WebElement singUpButton;

    @FindBy(xpath = "//a[@class='btn btn-warning br25 btn-block']")
    private WebElement forgotPasswordButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement warning;
}
