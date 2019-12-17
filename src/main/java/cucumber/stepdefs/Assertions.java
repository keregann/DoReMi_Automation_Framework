package cucumber.stepdefs;

import managers.ReflectionManager;
import org.apache.log4j.Logger;
import org.junit.Assert;

class Assertions {
    private static Logger log = Logger.getLogger(MyActions.class);

    static void pageIsDisplayed(String pageName) {
        String editedPageName = "pageObjects." + pageName.replace(" ", "") + "Page";
        try {
            Assert.assertTrue(ReflectionManager.pageInit(editedPageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info(pageName + " Page is displayed");
    }
}
