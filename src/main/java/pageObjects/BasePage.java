package pageObjects;

import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver driver;
    public BasePage() {
        driver = WebDriverManager.driver;
        PageFactory.initElements(driver, this);
    }
}
