package com.endava.doremi_automation_framework.util;

import com.endava.doremi_automation_framework.manager.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DrawBorder {
    public static void drawBorder(WebElement element_node) {
        JavascriptExecutor jse = (JavascriptExecutor) WebDriverManager.driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
    }

}
