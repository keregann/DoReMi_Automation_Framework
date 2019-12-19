package com.endava.framework.pageObject;

import lombok.Getter;
import com.endava.framework.manager.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BookingDetailsPage extends BasePage {
    private final String url = "https://www.phptravels.net/thhotels/checkout/";
    private WebDriver driver = WebDriverManager.driver;

    @FindBy(xpath = "//select[@id='title']")
    private WebElement titleField;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='phone_number']")
    private WebElement phone;

    @FindBy(xpath = "//form[2]")
    private WebElement completeBookingButton;

    public WebElement getCountry(String country) {
        WebElement chosenField = driver.findElement(By.xpath("//*[@id='country_code_chosen']"));
        chosenField.click();
        return driver.findElement(By.xpath("//option[contains(text(),'" + country + "')]"));

    }

    public WebElement getTitle(String title) {
        WebElement chosenField = driver.findElement(By.xpath("//label[contains(text(),'Title')]/following-sibling::select[@id='title']"));
        chosenField.click();
        return driver.findElement(By.xpath("//option[contains(text(),'" + title + "')]"));

    }
}
