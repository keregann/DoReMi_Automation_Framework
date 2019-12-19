package cucumber;

import cucumber.api.DataTable;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedHashMap;
import java.util.Map;

import static cucumber.stepdefs.Assertions.isDisplayed;
import static cucumber.stepdefs.Assertions.moveTo;
import static managers.ReflectionManager.getWebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static utils.DrawBorder.drawBorder;


public class Actions {
    private static Logger log = Logger.getLogger(Actions.class);
    private static WebDriver driver;
    private WebDriverWait wait;

    public Actions() {
        driver = WebDriverManager.driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void click(String elementName) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        drawBorder(webElement);
        wait.until(ExpectedConditions.elementToBeClickable(moveTo(webElement))).click();
        log.info(elementName + " is clicked");
    }

    public void inputDataTable(DataTable params) {
        Map<String, String> values = new LinkedHashMap<>(params.asMap(String.class, String.class));
        values.forEach((key, value) -> {
            try {
                isDisplayed(getWebElement(key)).sendKeys(value);
                log.info(value + " introduced into " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public void inputLocation(String elementName, String value) {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        drawBorder(webElement);
        webElement.click();
        webElement.sendKeys(value);
        WebElement foundElement = driver.findElement(By.xpath("//div//span[contains(text(),'" + value + "')]"));
        wait.until(visibilityOf(foundElement));
        drawBorder(foundElement);
        foundElement.click();
        log.info(webElement.getText() + " input: " + value);
    }

    public void inputFlightsDate(String elementName, String value) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        drawBorder(webElement);

        System.out.println("FLIGHTS DATE  :" + webElement.getTagName());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)");
        webElement.click();

        if (elementName.equalsIgnoreCase("Depart Calendar")) {
            WebElement startDate = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/div[1]/div[2]/div[" + value + "]"));
            wait.until(ExpectedConditions.elementToBeClickable(startDate)).click();
        } else if (elementName.equalsIgnoreCase("Return Calendar")) {
            WebElement endDate = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[8]/div[1]/div[1]/div[2]/div[24]"));
            wait.until(ExpectedConditions.elementToBeClickable(endDate)).click();
        }
    }
}
