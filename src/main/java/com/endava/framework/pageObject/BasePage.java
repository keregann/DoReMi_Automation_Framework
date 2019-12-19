package com.endava.framework.pageObject;

import com.endava.framework.manager.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(WebDriverManager.driver, this);
    }

    public abstract String getUrl();

}
