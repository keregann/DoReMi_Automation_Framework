package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;
import utils.DriverFactory;

public class FlightBookingPage extends BasePage {


    @FindBy(xpath = "//select[@id='title']")
    WebElement titleDropDown;

    @FindBy(xpath = "//option[contains(text(),'Mr.')]")
    WebElement titleOption;

    @FindBy(xpath = "//input[@id='name']")
    WebElement nameField;

    @FindBy(xpath = "//input[@id='surname']")
    WebElement surnameField;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement phoneField;

    @FindBy(xpath = "//input[@id='birthday']")
    WebElement birthdayField;

    @FindBy(xpath = "//input[@id='cardno']")
    WebElement passportField;

    @FindBy(xpath = "//input[@id='expiration']")
    WebElement expirationPassportDate;

    @FindBy(xpath = "//a[@class='select2-choice']")
    WebElement nationalityDropDown;

    @FindBy(xpath = "//div[contains(text(),'MOLDOVA, REPUBLIC OF')]")
    WebElement nationalityOption;

    //Payment Types
    @FindBy(xpath = "//select[@id='cardtype']")
    WebElement cardTypeDropDown;

    @FindBy(xpath = "//option[contains(text(),'Visa')]")
    WebElement cardTypeOption;

    @FindBy(xpath = "//input[@id='card-number']")
    WebElement cardNumber;

    @FindBy(xpath = "//select[@id='expiry-month']")
    WebElement cardExpirationMonth;

    @FindBy(xpath = "//option[contains(text(),'Apr (04)')]")
    WebElement cardExpirationMonthOption;

    @FindBy(xpath = "//select[@id='expiry-year']")
    WebElement cardExpirationYear;

    @FindBy(xpath = "//option[contains(text(),'2022')]")
    WebElement cardExpirationYearOption;

    @FindBy(xpath = "//input[@id='cvv']")
    WebElement cvvField;


    //Confirmation
    @FindBy(xpath = "//label[contains(text(),'By clicking to complete this booking I acknowledge')]")
    WebElement acceptRulesCheckBox;

    @FindBy(xpath = "//button[@id='confirmBooking']")
    WebElement confirmBtn;

    JavascriptExecutor js = (JavascriptExecutor) DriverFactory.driver;

    public FlightBookingPage enterData() throws InterruptedException {
        js.executeScript("window.scrollBy(0,200)");
        titleDropDown.click();
        Thread.sleep(500);
        titleOption.click();
        nameField.sendKeys("Alex");
        surnameField.sendKeys("Fasii");
        emailField.sendKeys("user@phptravels.com");
        phoneField.sendKeys("+37379371306");
        birthdayField.sendKeys("1990-01-01");
        passportField.sendKeys("85694123");
        expirationPassportDate.sendKeys("2020-01-01");
        nationalityDropDown.click();
        Thread.sleep(500);
        nationalityOption.click();

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);


        //Payments
        cardTypeDropDown.click();
        cardTypeOption.click();
        cardNumber.sendKeys("4562359867451234");
        cardExpirationMonth.click();
        cardExpirationMonthOption.click();
        cardExpirationYear.click();
        cardExpirationYearOption.click();
        cvvField.sendKeys("965");
        acceptRulesCheckBox.click();
        confirmBtn.click();

        return this;
    }
}
