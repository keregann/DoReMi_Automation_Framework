package pageObjects;

import managers.WebDriverManager;
import managers.drivermanager.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseDriver {
    public static WebDriver driver;
    public BasePage() {
        driver = WebDriverManager.driver;
        PageFactory.initElements(driver, this);
    }
}
