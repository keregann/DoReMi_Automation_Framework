package cucumber;

import managers.Reflection;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static managers.Reflection.getWebElement;
import static utils.DrawBorder.drawBorder;


public class Actions {
    private static Logger log = Logger.getLogger(Reflection.class);
    private static WebDriver driver = WebDriverManager.driver;
    private WebDriverWait wait;

    public void click(String elementName) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        //actions.moveToElement(webElement);
        drawBorder(webElement);
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
        log.info(webElement + " is clicked");
    }

    public void input(String elementName, String value) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        wait.until(ExpectedConditions.visibilityOf(webElement));
        drawBorder(webElement);
        webElement.sendKeys(value);
        log.info(webElement + " input: " + value);
    }

    public void inputHotelDestination(String elementName, String value) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        drawBorder(webElement);
        webElement.sendKeys(value);
        WebElement foundElement = driver.findElement(By.xpath("//div//span[contains(text(),'" + value + "')]"));
        wait.until(ExpectedConditions.visibilityOf(foundElement));
        foundElement.click();
        log.info(webElement + " input: " + value);
    }

    public void inputFlights(String elementName, String value) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        drawBorder(webElement);
        webElement.sendKeys(value);
        //need to add waiter
        webElement.sendKeys(Keys.ENTER);
        log.info(webElement + " input: " + value);
    }

    public void inputHotelDate(String elementName, String value) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        drawBorder(webElement);
        webElement.sendKeys(value);
        webElement.sendKeys(Keys.TAB);
        log.info(webElement + " input: " + value);
    }

    public void inputFlightsDate(String elementName, String value) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        String[] strings = value.split("/", 2);
        String day = strings[0];
        drawBorder(webElement);
        webElement.click();
        WebElement dayElem = driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[1]//div[2]//div[text()='" + day + "']"));
        dayElem.click();
    }

    public void inputAmount(String element, String value) {
    }
}
