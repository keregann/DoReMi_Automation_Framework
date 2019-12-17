package cucumber.stepdefs;

import managers.ReflectionManager;
import org.apache.log4j.Logger;
import org.junit.Assert;

class Assertions {
    private static Logger log = Logger.getLogger(Assertions.class);

    static void pageIsDisplayed(String pageName) {
        String editedPageName = "pageObjects." + pageName.replace(" ", "") + "Page";
        try {
            Assert.assertTrue(ReflectionManager.pageInit(editedPageName));
        } catch (Exception exception) {
            exception.printStackTrace();
            log.error(exception);
        }
        log.info(pageName + " Page is displayed");
    }
}
