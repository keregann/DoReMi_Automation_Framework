package com.endava.doremi_automation_framework.pageObject;

import com.endava.doremi_automation_framework.manager.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(WebDriverManager.driver, this);
    }

    public abstract String getUrl();

}
