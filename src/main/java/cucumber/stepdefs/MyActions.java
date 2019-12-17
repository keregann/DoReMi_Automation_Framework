package cucumber.stepdefs;

import managers.ReflectionManager;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ScreenShotsMaker;

public class MyActions {
    private static Logger log = Logger.getLogger(MyActions.class);
    private Actions actions;
    private WebDriverWait wait;

    MyActions() {
        actions = new Actions(WebDriverManager.driver);
        wait = new WebDriverWait(WebDriverManager.driver, 5);
    }

    public void click(String element) throws Exception {
        WebElement webElement = ReflectionManager.getWebElement(element.replace(" ", ""));
        actions.moveToElement(webElement);
        drawBorder(webElement);
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
        //ScreenShotsMaker.screenshot();
        log.info(element + "  is clicked");
    }

    private void drawBorder(WebElement element_node) {
        JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
    }
}
