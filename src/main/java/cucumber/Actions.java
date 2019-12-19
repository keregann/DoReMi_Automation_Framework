package cucumber;


import cucumber.api.DataTable;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedHashMap;
import java.util.Map;

import static managers.ReflectionManager.getWebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static utils.DrawBorder.drawBorder;


public class Actions {
    private static Logger log = Logger.getLogger(Actions.class);
    private static WebDriver driver = WebDriverManager.driver;
    private WebDriverWait wait;

    public Actions() {
        wait = new WebDriverWait(driver, 5);
    }

    public void click(String elementName) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        wait.until(elementToBeClickable(webElement));
        drawBorder(webElement);
        webElement.click();
        log.info(elementName + " is clicked");
    }


    public void clickJS(String elementName) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        drawBorder(webElement);
        JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        jse.executeScript("arguments[0].click()", webElement);
        log.info(webElement + " is clicked");
    }

    public void input(String elementName, String value) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        wait.until(visibilityOf(webElement));
        drawBorder(webElement);
        webElement.sendKeys(value);
        log.info(webElement + " input: " + value);
    }

    public void inputDataTable(DataTable params) {
        Map<String, String> values = new LinkedHashMap<>(params.asMap(String.class, String.class));
        values.forEach((key, value) -> {
            WebElement element = getWebElement(key);
            drawBorder(element);
            element.sendKeys(value);
            log.info(element + " input: " + value);
        });
    }

    public void inputLocation(String elementName, String value) throws InterruptedException {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        jse.executeScript("arguments[0].click()", webElement);
        webElement.sendKeys(value);
        WebElement foundElement = driver.findElement(By.xpath("//div//span[contains(text(),'" + value + "')]"));
        wait.until(visibilityOf(foundElement));
        Thread.sleep(1000);   //sters
        foundElement.click();
        log.info(webElement + " input: " + value);
    }
}
