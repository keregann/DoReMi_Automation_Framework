package managers;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Method;
import java.util.List;

public class BabySitterManager {
    private static BabySitterManager babySitterManager = new BabySitterManager();
    private static Class currentPageClass;
    private static Method[] currentMethods;
    private static WebElement webElement;

    public static void isDisplayed(String pageName) throws Exception {
        System.out.println("=========IS DISPLAYED METHOD:=========" + currentPageClass);
        setCurrentPage(pageName);
        Assert.assertTrue(webElement.isDisplayed());
        Assert.assertTrue(webElement.isEnabled());
    }

    public static void click(String cucumberWebElementName) throws Exception {
        System.out.println("=========CLICK METHOD:=========");
        setElementName(cucumberWebElementName);
        Assert.assertTrue(webElement.isDisplayed());
        Assert.assertTrue(webElement.isEnabled());
        webElement.click();
    }

    public static void enterData(DataTable table) throws Exception {
        System.out.println("=========USER ENTERS THE FOLLOWING VALUES METHOD:=========");
        List<TableData> tableData;
        tableData = table.asList(TableData.class);
        System.out.println("Table data size : " + tableData.size());

        for (TableData t : tableData) {
            for (Method meth : currentMethods) {
                if (meth.getName().equalsIgnoreCase("get" + t.key)) {
                    webElement = (WebElement) meth.invoke(currentPageClass.newInstance());
                    Assert.assertTrue(webElement.isDisplayed());
                    System.out.println("Enterdata WEBELEMENT CHOSEN: " + webElement);
                    if (currentPageClass.getName().equalsIgnoreCase(("pageObjects.FlightsTab"))) {
                        Thread.sleep(1500);
                        webElement.click();
                        webElement.sendKeys(t.value);
                        Thread.sleep(2000);
                        webElement.sendKeys(Keys.ENTER);
                        Thread.sleep(2000);
                    } else {
                        webElement.clear();
                        webElement.sendKeys(t.value);
                    }
                    System.out.println("KEY: " + t.key + " " + "VALUE: " + t.value);
                }
            }
        }
    }

    private static void setElementName(String elementName) throws Exception {
        String editedElementName = elementName.replace(" ", "");
        iterateMethods(editedElementName);
    }

    private static void setCurrentPage(String cucumberPageName) throws Exception {
        System.out.println("=========SET CURRENT PAGE METHOD:=========");
        String pageName = cucumberPageName.replace(" ", "");
        currentPageClass = Class.forName("pageObjects." + pageName);
        System.out.println("CURRENT PAGE : " + currentPageClass);
        setCurrentMethods(pageName);
    }

    private static void setCurrentMethods(String pageName) throws Exception {
        System.out.println("=========SET CURRENT METHODS:=========");
        currentMethods = currentPageClass.getDeclaredMethods();
        iterateMethods(pageName);
    }

    private static void iterateMethods(String elementToCompare) throws Exception {
        System.out.println("=========ITERATE METHODS:=========");
        for (Method meth : currentMethods) {
            if (meth.getName().equalsIgnoreCase("get" + elementToCompare)) {
                webElement = (WebElement) meth.invoke(currentPageClass.newInstance());
                System.out.println("WEB ELEMENT : " + webElement);
            }
        }
    }

    public static class TableData {
        private String key;
        private String value;

        public TableData(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

