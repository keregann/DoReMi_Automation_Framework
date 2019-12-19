package com.endava.framework.pageObject;

import lombok.Getter;
import com.endava.framework.manager.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BookingDetailsPage extends BasePage {
    private final String url = "k";
    private WebDriver driver = WebDriverManager.driver;

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

    @FindBy(xpath = "//div[@id='cookyGotItBtnBox']")
    private WebElement completeBookingButton;

    public void selectCountry(String country) {
        WebElement chosenField = driver.findElement(By.xpath("//*[@id='country_code_chosen']"));
        chosenField.click();
        WebElement chosenOption = driver.findElement(By.xpath("//option[contains(text(),'" + country + "')]"));
        chosenOption.click();
    }

    public void selectTitle(String title) {
        WebElement chosenField = driver.findElement(By.xpath("//label[contains(text(),'Title')]/following-sibling::select[@id='title']"));
        chosenField.click();
        WebElement chosenOption = driver.findElement(By.xpath("//option[contains(text(),'" + title + "')]"));
        chosenOption.click();
    }
}
