package cucumber.stepdefs;

import managers.Reflection;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyActions {
    private static Logger log = Logger.getLogger(Reflection.class);
    Actions actions;

    public MyActions() {
        actions = new Actions(WebDriverManager.driver);
    }

    public void click(String element) throws Exception {
        WebElement webElement = Reflection.getWebElement(element.replace(" ", ""));
        actions.moveToElement(webElement);
        WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 5);
        drawBorder(webElement);
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
        log.info(webElement + "is clicked");
    }

    private void drawBorder(WebElement element_node) {
        JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        jse.executeScript("arguments[0].style.border='3px solid blue'", element_node);
    }
}
