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

    public static void pageInit(String pageName) throws Exception {
        try {
            currentPageClass = Class.forName("pageObjects." + pageName + "Page");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            BasePage basePage = (BasePage) currentPageClass.newInstance();
            if (WebDriverManager.driver.getCurrentUrl().matches(basePage.getUrl())) {
                currentPageMethods = currentPageClass.getDeclaredMethods();
                log.info(currentPageClass + " is initialized");
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static WebElement getWebElement(String element) throws Exception {
        WebElement webElement = null;
        try {
            for (Method method : currentPageMethods) {
                if (method.getName().equalsIgnoreCase("get" + element)) {
                    webElement = (WebElement) method.invoke(currentPageClass.newInstance());
                }
            }
        } catch (IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return webElement;
    }
}


