package pages;

import driver.Singleton;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Singleton.driver, this);
    }
}
