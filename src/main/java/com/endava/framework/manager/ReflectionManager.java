package com.endava.framework.manager;

import com.endava.framework.dataProvider.ConfigFileReader;
import com.endava.framework.pageObject.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionManager {

    public static Class currentPageClass;
    private static Method[] currentPageMethods;
    private static WebDriverWait wait;
    private static Logger log = Logger.getLogger(ReflectionManager.class);


    public static boolean pageInit(String pageName) throws Exception {
        boolean isInitialized = false;
        try {
            currentPageClass = Class.forName(ConfigFileReader.getInstance().getPageObjectPath() + pageName + "Page");
            BasePage basePage = (BasePage) currentPageClass.newInstance();
            wait = new WebDriverWait(WebDriverManager.driver, 10);
            wait.until(ExpectedConditions.urlContains(basePage.getUrl()));
            currentPageMethods = currentPageClass.getDeclaredMethods();
            isInitialized = true;
            log.info(currentPageClass.getName() + " is initialized");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
            log.error(exception.getStackTrace());
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
            log.error(exception.getStackTrace());
        }
        return webElement;
    }
}


