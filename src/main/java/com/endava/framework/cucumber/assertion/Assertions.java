package com.endava.framework.cucumber.assertion;

import com.endava.framework.manager.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.endava.framework.manager.ReflectionManager.pageInit;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static com.endava.framework.util.DrawBorder.drawBorder;

public class Assertions {
    private static Logger log = Logger.getLogger(Assertions.class);

    public static void pageIsDisplayed(String pageName) throws Exception {
        String editedPageName = pageName.replace(" ", "");
        assertThat(String.format("Page %s is displayed", pageName), pageInit(editedPageName), is(true));
        log.info(pageName + " Page is displayed");
    }

    public static WebElement isDisplayed(WebElement webElement) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 5);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        drawBorder(webElement);
        return webElement;
    }

    public static WebElement moveTo(WebElement webElement) throws InterruptedException {
        Actions actions = new Actions(WebDriverManager.driver);
        actions.moveToElement(webElement).build().perform();
        return webElement;
    }
}
