package cucumber.stepdefs;

import managers.ReflectionManager;
import org.apache.log4j.Logger;

import static managers.ReflectionManager.pageInit;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class Assertions {
    private static Logger log = Logger.getLogger(Assertions.class);

    static void pageIsDisplayed(String pageName) {
        String editedPageName = pageName.replace(" ", "");
        assertThat(String.format("Page %s is displayed", pageName), pageInit(editedPageName), is(true));
        log.info(pageName + " Page is displayed");
    }
}
