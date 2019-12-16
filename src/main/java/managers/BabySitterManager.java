package managers;

import cucumber.api.DataTable;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.FlightsTab;
import pageObjects.HotelsTab;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

public class BabySitterManager {

    private static BabySitterManager babySitterManager = new BabySitterManager();
    private static Class currentPageClass;
    private static Method[] currentPageMethods;
    private static WebElement webElement;
    private static JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.driver;
    private static Logger log = Logger.getLogger(BabySitterManager.class);

    public static void messageIsDisplayed(String element) throws Exception {
        iterateMethods(element);
        Thread.sleep(2000);
        if (!webElement.isDisplayed()) {
            js.executeScript("arguments[0].scrollIntoView();", webElement);
            Thread.sleep(1000);
        }
        drawBorder(webElement);
        Assert.assertTrue(webElement.isDisplayed());
        log.info(webElement.getText() + " is displayed");
    }

    public static void pageIsDisplayed(String pageName) throws Exception {
        System.out.println("=========IS DISPLAYED METHOD:=========" + currentPageClass);
        setCurrentPage(pageName);
        System.out.println(webElement.isDisplayed());
        Assert.assertTrue(webElement.isDisplayed());
        //ScreenShotsMaker.screenshot();
        log.info(pageName + " is displayed");
    }

    public static void click(String cucumberWebElementName) throws Exception {
        System.out.println("=========CLICK METHOD:=========");
        setElementName(cucumberWebElementName);
        Assert.assertTrue(webElement.isDisplayed());
        Thread.sleep(1000);
        Actions actions = new Actions(WebDriverManager.driver);
        actions.moveToElement(webElement).build().perform();
        Thread.sleep(500);
        drawBorder(webElement);
        actions.click(webElement).build().perform();
        Thread.sleep(500);
        log.info(cucumberWebElementName + " is clicked");

    }

    public static void enterData(DataTable table) throws Exception {
        System.out.println("=========USER ENTERS THE FOLLOWING VALUES METHOD:=========");
        List<TableData> tableData;
        tableData = table.asList(TableData.class);
        System.out.println("Table data size : " + tableData.size());

        for (TableData t : tableData) {
            for (Method meth : currentPageMethods) {
                if (meth.getName().equalsIgnoreCase("get" + t.key)) {
                    webElement = (WebElement) meth.invoke(currentPageClass.newInstance());
                    Assert.assertTrue(webElement.isDisplayed());
                    System.out.println("TABLE DATA WEB ELEMENT CHOSEN: " + webElement);
                    if (currentPageClass.getName().equalsIgnoreCase(("pageObjects.FlightsTab")) ||
                            currentPageClass.getName().equalsIgnoreCase(("pageObjects.HotelsTab"))) {
                        Thread.sleep(1500);
                        webElement.click();
                        webElement.sendKeys(t.value);
                        Thread.sleep(2000);
                        webElement.sendKeys(Keys.ENTER);
                        log.info(t.value + " is entered into " + t.key);
                        Thread.sleep(2000);
                    } else {
                        webElement.clear();
                        drawBorder(webElement);
                        webElement.sendKeys(t.value);
                        log.info(t.value + " is entered into " + t.key);
                    }
                    System.out.println("KEY: " + t.key + " " + "VALUE: " + t.value);
                }
            }
        }
    }

    public static void setDate(Date date) {
        if (currentPageClass.getName().equalsIgnoreCase("pageObjects.FlightsTab")) {
            FlightsTab tab = new FlightsTab();
            tab.getDepartCalendar();

            HotelsTab hotelsTab = new HotelsTab();
            hotelsTab.getDestinationField();
        } else if (currentPageClass.getName().equalsIgnoreCase("pageObjects.HotelsTab")) {
            HotelsTab hotelsTab = new HotelsTab();
            hotelsTab.getDestinationField();
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
        readCurrentPageMethods(pageName);
    }

    private static void readCurrentPageMethods(String pageName) throws Exception {
        System.out.println("=========SET CURRENT METHODS:=========");
        currentPageMethods = currentPageClass.getDeclaredMethods();
        iterateMethods(pageName);
    }

    private static void iterateMethods(String elementToCompare) throws Exception {
        System.out.println("=========ITERATE METHODS:=========");
        for (Method meth : currentPageMethods) {
            if (meth.getName().equalsIgnoreCase("get" + elementToCompare)) {
                webElement = (WebElement) meth.invoke(currentPageClass.newInstance()); //
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

    private static void drawBorder(WebElement element_node) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
        Thread.sleep(200);
        jse.executeScript("arguments[0].style.border='3px solid green'", element_node);
        Thread.sleep(200);
        jse.executeScript("arguments[0].style.border='hidden'", element_node);
    }

}

