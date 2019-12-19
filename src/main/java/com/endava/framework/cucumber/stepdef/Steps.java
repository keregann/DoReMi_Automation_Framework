package  com.endava.framework.cucumber.stepdef;

import  com.endava.framework.cucumber.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import com.endava.framework.cucumber.assertion.*;

import static com.endava.framework.dataProvider.ConfigFileReader.getScreenShotFlag;
import static com.endava.framework.util.ScreenShotsMaker.takeScreenshot;

public class Steps {
    private Actions actions = new Actions();
    private Assertions assertion = new Assertions();

    @Given("^'(.*)' page is displayed$")
    public void pageIsDisplayed(String pageName) throws Exception {
        Assertions.pageIsDisplayed(pageName);
    }

    @When("^user clicks '(.*)'$")
    public void click(String webElementName) throws Exception {
        actions.click(webElementName);
        takeScreenshot(getScreenShotFlag());
    }

    @When("^user enters the following values:$")
    public void userEntersTheFollowingValues(DataTable params) {
        actions.inputDataTable(params);
    }

    @And("^user chooses '(.*)' for '(.*)'$")
    public void userChoosesForLocation(String value, String elementName) throws InterruptedException {
        actions.inputLocation(elementName, value);
    }


    @And("^user sets '(.*)' date for '(.*)'$")
    public void userSetsDateForDepartCalendar(String value, String elementName) throws Exception {
        actions.inputFlightsDate(elementName, value);
    }
}
