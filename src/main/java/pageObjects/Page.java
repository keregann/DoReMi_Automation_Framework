package pageObjects;

import driver.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public Page() {
        PageFactory.initElements(DriverFactory.driver, this);
    }
}
