package pageObjects;

import managers.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(WebDriverManager.driver, this);
    }

    public abstract String getUrl();

}
