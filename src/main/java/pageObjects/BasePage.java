package pageObjects;

import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static managers.WebDriverManager.driver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(WebDriverManager.driver, this);
    }
}
