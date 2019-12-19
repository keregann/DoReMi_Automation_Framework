package cucumber.stepdefs;

import cucumber.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static dataProviders.ConfigFileReader.getScreenShotFlag;
import static utils.ScreenShotsMaker.takeScreenshot;

public class Steps {
    private Actions actions = new Actions();

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
