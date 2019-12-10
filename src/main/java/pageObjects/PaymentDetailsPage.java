package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDetailsPage extends BasePage {

    WebDriver driver;
//
//    public PaymentDetailsPage(WebDriver driver) {
//        this.driver = driver;
//    }

    @FindBy(xpath = "//select[@id='title']")
    private WebElement titleField;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastNameField;

   @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/input[1]")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='phone_number']")
    private WebElement phoneField;

    @FindBy(xpath = "//input[@id='cardHolderName']")
    private WebElement nameOnCardField;

    @FindBy(xpath = "//input[@id='cardNumber']")
    private WebElement cardNumberField;

    @FindBy(xpath = "//input[@id='cardCVC']")
    private WebElement securityCodeField;

    @FindBy(xpath = "//div[@id='cookyGotItBtnBox']")
    private WebElement completeBookingButton;


    private void selectCountry(String country) {
        WebElement chosenField = driver.findElement(By.xpath("//*[@id='country_code_chosen']"));
        chosenField.click();
        WebElement chosenOption = driver.findElement(By.xpath("//option[contains(text(),'" + country + "')]"));
        chosenOption.click();
    }


    private void selectTitle(String title) {
        WebElement chosenField = driver.findElement(By.xpath("//label[contains(text(),'Title')]/following-sibling::select[@id='title']"));
        chosenField.click();
        WebElement chosenOption = driver.findElement(By.xpath("//option[contains(text(),'" + title + "')]"));
        chosenOption.click();
    }

    private void selectExpirationDate(int month, int year){
        WebElement monthField = driver.findElement(By.xpath("//select[@name='month']"));
        monthField.click();
        WebElement monthOption = driver.findElement(By.xpath("//option[contains(text(),'" + month + "')]"));
        monthOption.click();
        WebElement yearField = driver.findElement(By.xpath("//select[@name='year']"));
        yearField.click();
        WebElement yearOption = driver.findElement(By.xpath("//option[contains(text(),'" + year + "')]"));
        yearOption.click();

    }

    public PaymentDetailsPage inputBookingInformation(String title, String firstName, String lastName, String email, String country, String phone) throws InterruptedException {
        selectTitle(title);
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        return this;
    }

    public PaymentDetailsPage inputCardDetails(String name, String cardNumber, int month, int year, int securityCode) {
        nameOnCardField.sendKeys(name);
        cardNumberField.sendKeys(cardNumber);
        selectExpirationDate(month, year);
        securityCodeField.sendKeys(String.valueOf(securityCode));
        return this;
    }

    public PaymentDetailsPage completeBooking() {
        completeBookingButton.click();
        return this;
    }

}
