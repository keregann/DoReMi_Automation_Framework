package pageObjects;

import managers.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(WebDriverManager.driver, this);
    }
}
