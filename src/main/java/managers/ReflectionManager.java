package managers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionManager {

    private static Class currentPageClass;
    private static Method[] currentPageMethods;
    private static Logger log = Logger.getLogger(ReflectionManager.class);
    private static WebDriverWait wait;

    public static boolean pageInit(String pageName) {
        boolean isInitialized = false;
        try {
            currentPageClass = Class.forName("pageObjects." + pageName + "Page");
            BasePage basePage = (BasePage) currentPageClass.newInstance();
            wait = new WebDriverWait(WebDriverManager.driver, 10);
            wait.until(ExpectedConditions.urlToBe(basePage.getUrl()));
            currentPageMethods = currentPageClass.getDeclaredMethods();
            isInitialized = true;
            log.info(currentPageClass + " is initialized");
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException exception) {
            exception.printStackTrace();
            log.error("Error: " + exception);
        }
        return isInitialized;
    }

    public static WebElement getWebElement(String element) {
        WebElement webElement = null;
        try {
            for (Method method : currentPageMethods) {
                if (method.getName().equalsIgnoreCase("get" + element)) {
                    webElement = (WebElement) method.invoke(currentPageClass.newInstance());
                    break;
                }
            }
        } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException | InstantiationException exception) {
            exception.printStackTrace();
            log.error(exception);
        }
        return webElement;
    }
}


