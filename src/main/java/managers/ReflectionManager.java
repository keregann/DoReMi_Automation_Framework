package managers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionManager {

    private static ReflectionManager reflectionManager = new ReflectionManager();
    private static Class currentPageClass;
    private static Method[] currentPageMethods;
    private static Logger log = Logger.getLogger(ReflectionManager.class);

    public static Boolean pageInit(String pageName) throws Exception {
        boolean isInitialized = false;
        try {
            currentPageClass = Class.forName("pageObjects." + pageName + "Page");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
            log.error("Error: " + exception);
        }

        try {
            BasePage basePage = (BasePage) currentPageClass.newInstance();
            if (WebDriverManager.driver.getCurrentUrl().equalsIgnoreCase(basePage.getUrl())) {
                currentPageMethods = currentPageClass.getDeclaredMethods();
                isInitialized = true;
                log.info(currentPageClass + " is initialized");
            }
        } catch (InstantiationException exception) {
            exception.printStackTrace();
            log.error("Error: " + exception);
        }
        return isInitialized;
    }

    public static WebElement getWebElement(String element) throws Exception {
        WebElement webElement = null;
        try {
            for (Method method : currentPageMethods) {
                if (method.getName().equalsIgnoreCase("get" + element)) {
                    webElement = (WebElement) method.invoke(currentPageClass.newInstance());
                }
            }
        } catch (IllegalArgumentException | InvocationTargetException exception) {
            exception.printStackTrace();
            log.error(exception);
        }
        return webElement;
    }
}

