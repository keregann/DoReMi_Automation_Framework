package cucumber.stepdefs;

import managers.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static managers.ReflectionManager.pageInit;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Assertions {
    private static Logger log = Logger.getLogger(Assertions.class);

    static void pageIsDisplayed(String pageName) {
        String editedPageName = pageName.replace(" ", "");
        assertThat(String.format("Page %s is displayed", pageName), pageInit(editedPageName), is(true));
        log.info(pageName + " Page is displayed");
    }

    public static WebElement moveTo(WebElement webElement) throws InterruptedException {
        Actions actions = new Actions(WebDriverManager.driver);
        actions.moveToElement(webElement).build().perform();
        return webElement;
    }
}
