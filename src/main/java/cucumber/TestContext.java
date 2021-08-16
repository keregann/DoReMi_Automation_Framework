package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;
import managers.drivermanager.ASPPageObjectManager;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    private ASPPageObjectManager aspPageObjectManager;

    public TestContext() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        aspPageObjectManager = new ASPPageObjectManager(webDriverManager.getDriver());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
    public ASPPageObjectManager getAspPageObjectManager() {
        return aspPageObjectManager;
    }

}
