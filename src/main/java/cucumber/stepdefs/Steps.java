package cucumber.stepdefs;

import cucumber.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static dataProviders.ConfigFileReader.getScreenShotFlag;
import static utils.ScreenShotsMaker.takeScreenshot;

public class Steps {
    private MyActions myActions = new MyActions();
    private Actions actions = new Actions();
    // private Assertions assertion = new Assertions();

    @Given("^'(.*)' page is displayed$")
    public void pageIsDisplayed(String pageName) throws Exception {
        Assertions.pageIsDisplayed(pageName);
    }

    @When("^user clicks '(.*)'$")
    public void click(String webElementName) throws Exception {
        myActions.click(webElementName);
        takeScreenshot(getScreenShotFlag());
    }

    @When("^user enters the following values:$")
    public void userEntersTheFollowingValues(DataTable params) {
        actions.inputDataTable(params);
    }
//
//    @When("^user enters the following values:$")
//    public void userEntersTheFollowingValues(DataTable table) throws Exception {
//        Reflection.enterData(table);
//    }
//
//    @Then("^'(.*)' message is displayed$")
//    public void warningMessageIsDisplayed(String element) throws Exception {
//        BabySitterManager.messageIsDisplayed(element);
//    }
//
//    @And("^sets the following date:$")
//    public void setsTheFollowingDate() {
//        BabySitterManager.setDate();
//    }
}
