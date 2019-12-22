package com.endava.framework.cucumber.assertion;

import com.endava.framework.constant.WarningMessages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.endava.framework.manager.ReflectionManager.getWebElement;
import static com.endava.framework.manager.ReflectionManager.pageInit;
import static com.endava.framework.manager.WebDriverManager.driver;
import static com.endava.framework.util.DrawBorder.drawBorder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Assertions {
    private static Logger log = Logger.getLogger(Assertions.class);

    public static void pageIsDisplayed(String pageName) throws Exception {
        String editedPageName = pageName.replace(" ", "");
        assertThat(String.format("%s Page is displayed", pageName), pageInit(editedPageName), is(true));
        log.info(pageName + " Page is displayed");
    }

    public static WebElement isDisplayed(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        drawBorder(webElement);
        return webElement;
    }

    public static WebElement moveTo(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();
        return webElement;
    }

    public static void warningMessageIsDisplayed(WarningMessages warningMessages) {
        String message = warningMessages.getMessage();
        WebElement webElement = getWebElement("warningMessage");
        assertThat(message, webElement.getText().contains(message), is(true));
        log.info("'" + message + "'" + " message is displayed");
    }
}
