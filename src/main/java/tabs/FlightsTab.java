package tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;
import pages.FlightsResultPage;
import utils.DriverFactory;

public class FlightsTab extends BasePage {

    @FindBy(xpath = "//a[contains(@class,'text-center flights')]")
    WebElement flightsTab;

    @FindBy(xpath = "//label[contains(text(),'One Way')]")
    WebElement oneWayRadioBtn;

    @FindBy(xpath = "//label[contains(text(),'Round Trip')]")
    WebElement roundTripRadioBtn;

    @FindBy(xpath = "//span[contains(text(),'Economy')]")
    WebElement dropDown;

    @FindBy(xpath = "//div[@id='s2id_location_from']//a[@class='select2-choice']")
    WebElement fromField;

    @FindBy(xpath = "//div[@id='s2id_location_to']//a[@class='select2-choice']")
    WebElement toField;

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

    @FindBy(xpath = "//div[contains(@class,'col-xs-12 col-md-1')]//button[contains(@class,'btn-primary btn btn-block')][contains(text(),'Search')]")
    WebElement searchBtn;


    public FlightsResultPage setFlight() throws InterruptedException {
        flightsTab.click();

        roundTripRadioBtn.click();
        dropDown.click();
        Thread.sleep(500);
        DriverFactory.driver.findElement(By.xpath("//li[contains(text(),'First')]")).click();
        fromField.click();
        fromField.sendKeys("Chisinau");
        Thread.sleep(1500);
        fromField.sendKeys(Keys.ENTER);

        toField.click();
        toField.sendKeys("Kiev");
        Thread.sleep(1500);
        toField.sendKeys(Keys.ENTER);

        Thread.sleep(1500);
        departCalendar.click();
        DriverFactory.driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div[13]")).click();
        Thread.sleep(1500);
        returnCalendar.click();
        DriverFactory.driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[2]//div[27]")).click();
        Thread.sleep(1500);

        adultsFieldPlus.click();
        childFieldPlus.click();
        infantFieldPlus.click();
        searchBtn.click();

        return new FlightsResultPage();
    }
}
