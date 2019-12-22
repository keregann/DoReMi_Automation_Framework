package com.endava.framework.cucumber;

import com.endava.framework.manager.ReflectionManager;
import com.endava.framework.manager.WebDriverManager;
import cucumber.api.DataTable;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.endava.framework.cucumber.assertion.Assertions.isDisplayed;
import static com.endava.framework.cucumber.assertion.Assertions.moveTo;
import static com.endava.framework.manager.ReflectionManager.getWebElement;
import static com.endava.framework.manager.ReflectionManager.getWebElements;
import static com.endava.framework.util.DrawBorder.drawBorder;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class MyActions {
    private static Logger log = Logger.getLogger(MyActions.class);
    private static WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public MyActions() {
        driver = WebDriverManager.driver;
        wait = new WebDriverWait(WebDriverManager.driver, 10);
        actions = new Actions(WebDriverManager.driver);
    }

    public void click(String elementName) {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        wait.until(ExpectedConditions.visibilityOf(webElement));
        drawBorder(webElement);
        wait.until(ExpectedConditions.elementToBeClickable((moveTo(webElement)))).click();
        log.info(elementName + " is clicked");
    }


    public void clickJS(String elementName) {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        jse.executeScript("arguments[0].click()", webElement);
        log.info(webElement + " is clicked");
    }


    public void inputDataTable(DataTable params) {
        Map<String, String> values = new LinkedHashMap<>(params.asMap(String.class, String.class));
        values.forEach((key, value) -> {
            WebElement webElement = getWebElement(key);
            isDisplayed(webElement).click();
            webElement.clear();
            webElement.sendKeys(value);
            log.info(value + " introduced into " + key);
        });
    }

    public void scrollPage(String element) {
        WebElement webElement = getWebElement(element.replace(" ", ""));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void dropDownList(String element, String values) {
        WebElement webElement = getWebElement(element.replace(" ", ""));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        drawBorder(webElement);
        webElement.click();
        List<WebElement> webElements = getWebElements(element.replace(" ", "") + "Options");
        for (WebElement e : webElements) {
            if (e.getText().contains(values)) {
                drawBorder(e);
                e.click();
                break;
            }
        }
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
        } else if (elementName.equalsIgnoreCase("Date")) {
            WebElement date = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[6]/div[1]/div[1]/div[2]/div[" + value + "]"));
            drawBorder(date);
            wait.until(ExpectedConditions.elementToBeClickable(date)).click();
            log.info(value + " set to " + elementName);
        }
    }

    public void setPassengers(Integer numberOf, String name) {
        if (ReflectionManager.currentPageClass.getName().contains("HotelsTabPage")) {
            setPersons(numberOf, name, 0, 1);
        } else if (ReflectionManager.currentPageClass.getName().contains("FlightsTabPage")) {
            setPersons(numberOf, name, 2, 3, 4);
        } else if (ReflectionManager.currentPageClass.getName().contains("ToursTabPage")) {
            setPersons(numberOf, name, 5);
        }
    }

    private void setPersons(Integer number, String name, int... key) {
        WebElement personType = getWebElement(name);
        drawBorder(personType);
        List<WebElement> plusButtons = WebDriverManager.driver
                .findElements(By.xpath("//button[@class='btn btn-white bootstrap-touchspin-up ']"));
        switch (name) {
            case "Adults":
                for (int i = 0; i <= number - 2; i++) {
                    drawBorder(plusButtons.get(key[0]));
                    plusButtons.get(key[0]).click();
                }
                break;
            case "Child":
                for (int i = 0; i <= number - 1; i++) {
                    drawBorder(plusButtons.get(key[1]));
                    plusButtons.get(key[1]).click();
                }
                break;
            case "Infant":
                for (int i = 0; i <= number - 1; i++) {
                    drawBorder(plusButtons.get(key[2]));
                    plusButtons.get(key[2]).click();
                }
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
        actions.clickAndHold().moveByOffset(30, 0).release().build().perform();
        WebElement toSlider = getWebElement("toSlider");
        wait.until(ExpectedConditions.visibilityOf(toSlider));
        actions.moveToElement(toSlider);
        drawBorder(toSlider);
        actions.clickAndHold().moveByOffset(-60, 0).release().build().perform();
        log.info(" to slider moved");
    }

    public void input(String elementName, String value) {
        WebElement webElement = getWebElement(elementName.replace(" ", ""));
        wait.until(visibilityOf(webElement));
        drawBorder(webElement);
        webElement.sendKeys(value);
        log.info(webElement + " input: " + value);
    }

}
