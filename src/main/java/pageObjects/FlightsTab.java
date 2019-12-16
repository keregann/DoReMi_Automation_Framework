package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class FlightsTab extends BasePage {

    @FindBy(xpath = "//label[contains(text(),'One Way')]")
    WebElement flightsTab;

    @FindBy(xpath = "//label[contains(text(),'One Way')]")
    WebElement oneWayButton;

    @FindBy(xpath = "//label[contains(text(),'Round Trip')]")
    WebElement roundTripRadioBtn;

    @FindBy(xpath = "//span[contains(text(),'Economy')]")
    WebElement dropDown;

    @FindBy(xpath = "//div[@id='s2id_location_from']//a[@class='select2-choice']")
    WebElement from;

    @FindBy(xpath = "//div[@id='s2id_location_to']//a[@class='select2-choice']")
    WebElement to;

    @FindBy(xpath = "//input[@id='FlightsDateStart']")
    WebElement departCalendar;

    @FindBy(xpath = "//input[@id='FlightsDateEnd']")
    WebElement returnCalendar;

    @FindBy(xpath = "//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//input[1]")
    WebElement adultsField;

    @FindBy(xpath = "//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[1]//button[1]")
    WebElement adultsFieldPlus;

    @FindBy(xpath = "//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[1]//button[2]")
    WebElement adultsFieldMinus;

    @FindBy(xpath = "//div[@id='flights']//div[contains(@class,'col-md-3 col-xs-12')]//div[2]//div[1]//div[2]//div[1]//input[1]")
    WebElement childField;

    @FindBy(xpath = "//div[contains(@class,'row gap-10 mb-15 align-items-end row-reverse')]//div[2]//div[1]//div[2]//div[1]//span[1]//button[1]")
    WebElement childFieldPlus;

    @FindBy(xpath = "//div[contains(@class,'row gap-10 mb-15 align-items-end row-reverse')]//div[2]//div[1]//div[2]//div[1]//span[1]//button[2]")
    WebElement childFieldMinus;

    @FindBy(xpath = "//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//input[1]")
    WebElement infantField;

    @FindBy(xpath = "//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[1]//button[1]")
    WebElement infantFieldPlus;

    @FindBy(xpath = "//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[1]//button[2]")
    WebElement infantFieldMinus;

    @FindBy(xpath = "//div[@class='col-xs-12 col-md-1']//button[@class='btn-primary btn btn-block'][contains(text(),'Search')]")
    WebElement searchButton;


}


