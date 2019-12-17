package managers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.lang.reflect.Method;

public class Reflection {

    public static Class currentPageClass;
    private static Reflection reflection = new Reflection();
    private static Method[] currentPageMethods;
    private static Logger log = Logger.getLogger(Reflection.class);

    public static void pageInit(String pageName) throws Exception {
        Class className = null;
        try {
            className = Class.forName("pageObjects." + pageName + "Page");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        BasePage basePage = (BasePage) className.newInstance();

        String siteUrl = basePage.getUrl();
        System.out.println(siteUrl);
        currentPageClass = className;
        currentPageMethods = className.getDeclaredMethods();
        log.info(currentPageClass + " is initialized");
    }

    public static WebElement getWebElement(String element) throws Exception {
        WebElement webElement = null;
        for (Method method : currentPageMethods) {
            if (method.getName().equalsIgnoreCase("get" + element)) {
                webElement = (WebElement) method.invoke(currentPageClass.newInstance());
            }
        }
        return webElement;
    }
}


