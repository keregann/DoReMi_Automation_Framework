package pageObjects;

import drivermanager.BaseDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseDriver {

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
