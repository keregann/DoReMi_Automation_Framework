package com.endava.framework.cucumber;


import com.endava.framework.manager.WebDriverManager;
import cucumber.api.DataTable;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.endava.framework.cucumber.assertion.Assertions.isDisplayed;
import static com.endava.framework.cucumber.assertion.Assertions.moveTo;
import static com.endava.framework.manager.ReflectionManager.getWebElement;
import static com.endava.framework.util.DrawBorder.drawBorder;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class Actions {
    private static Logger log = Logger.getLogger(Actions.class);
    private static WebDriver driver;
    private WebDriverWait wait;
    org.openqa.selenium.interactions.Actions actions;

    public Actions() {
        driver = WebDriverManager.driver;
        wait = new WebDriverWait(WebDriverManager.driver, 10);
        actions = new org.openqa.selenium.interactions.Actions(WebDriverManager.driver);
    }

    public void click(String elementName) throws Exception {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        wait.until(ExpectedConditions.visibilityOf(webElement));
        drawBorder(webElement);
        wait.until(ExpectedConditions.elementToBeClickable((moveTo(webElement)))).click();
        log.info(elementName + " is clicked");
    }


    public void clickJS(String elementName) {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        // drawBorder(webElement);
        JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        jse.executeScript("arguments[0].click()", webElement);
        log.info(webElement + " is clicked");
    }

    public void input(String elementName, String value) {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        wait.until(visibilityOf(webElement));
        drawBorder(webElement);
        webElement.sendKeys(value);
        log.info(webElement + " input: " + value);
    }

    public void inputDataTable(DataTable params) {
        Map<String, String> values = new LinkedHashMap<>(params.asMap(String.class, String.class));
        values.forEach((key, value) -> {
            try {
                isDisplayed(getWebElement(key)).sendKeys(value);
                log.info(value + " introduced into " + key);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
                log.error(exception.getStackTrace());
            }
        });
    }

    public void inputLocation(String elementName, String value) {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        // JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        drawBorder(webElement);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
        actions.sendKeys(webElement, value).build().perform();

        // webElement.sendKeys(value);
        WebElement foundElement = driver.findElement(By.xpath("//div//span[contains(text(),'" + value + "')]"));
        wait.until(visibilityOf(foundElement));
        drawBorder(foundElement);
        foundElement.click();
        log.info(webElement.getText() + " input: " + value);
    }

    public void inputFlightsDate(String elementName, String value) {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        drawBorder(webElement);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)");
        webElement.click();

        if (elementName.equalsIgnoreCase("Depart Calendar")) {
            WebElement startDate = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/div[1]/div[2]/div[" + value + "]"));
            drawBorder(startDate);
            wait.until(ExpectedConditions.elementToBeClickable(startDate)).click();
            log.info(value + " set to " + elementName);
        } else if (elementName.equalsIgnoreCase("Return Calendar")) {
            WebElement endDate = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[8]/div[1]/div[1]/div[2]/div[" + value + "]"));
            drawBorder(endDate);
            wait.until(ExpectedConditions.elementToBeClickable(endDate)).click();
            log.info(value + " set to " + elementName);
        }
    }

    public void dropDownList(String element, String value) {
        WebElement webElement = getWebElement(element.replace(" ", ""));
        drawBorder(webElement);
        webElement.click();
        log.info(element + " is clicked");
        List<WebElement> listOf = WebDriverManager.driver.findElements(By.xpath("//li[@data-option-array-index]"));
        for (WebElement e : listOf) {
            if (e.getText().equalsIgnoreCase(value)) {
                drawBorder(e);
                e.click();
                log.info(value + " is clicked");
                break;
            }
        }
    }

    public void setPersons(int number, String name) {
        WebElement personType = getWebElement(name);
        drawBorder(personType);
        List<WebElement> plusButtons = WebDriverManager.driver
                .findElements(By.xpath("//button[@class='btn btn-white bootstrap-touchspin-up ']"));
        switch (name) {
            case "Adults":
                drawBorder(plusButtons.get(2));
                for (int i = 0; i <= number - 2; i++) {
                    plusButtons.get(2).click();
                }
                log.info(number + " persons added to " + name);
                break;
            case "Child":
                drawBorder(plusButtons.get(3));
                for (int i = 0; i <= number - 1; i++) {
                    plusButtons.get(3).click();
                }
                log.info(number + " persons added to " + name);
                break;
            case "Infant":
                drawBorder(plusButtons.get(4));
                for (int i = 0; i <= number - 1; i++) {
                    plusButtons.get(4).click();
                }
                log.info(number + " persons added to " + name);
                break;
        }
    }

    public void dragAndDrop() {
        WebElement fromSlider = getWebElement("fromSlider");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        wait.until(ExpectedConditions.visibilityOf(fromSlider));
        actions.moveToElement(fromSlider);
        drawBorder(fromSlider);
        actions.clickAndHold().moveByOffset(50, 0).release().build().perform();
        WebElement toSlider = getWebElement("toSlider");
        wait.until(ExpectedConditions.visibilityOf(toSlider));
        actions.moveToElement(toSlider);
        drawBorder(toSlider);
        actions.clickAndHold().moveByOffset(-60, 0).release().build().perform();
        log.info(" to slider moved");
    }

}
