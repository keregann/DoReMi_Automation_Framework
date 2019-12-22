package com.endava.framework.cucumber.stepdef;

import com.endava.framework.constant.WarningMessages;
import com.endava.framework.cucumber.MyActions;
import com.endava.framework.cucumber.assertion.Assertions;
import com.endava.framework.manager.ReflectionManager;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.endava.framework.cucumber.assertion.Assertions.warningMessageIsDisplayed;
import static com.endava.framework.dataProvider.ConfigFileReader.getScreenShotFlag;
import static com.endava.framework.util.ScreenShotsMaker.takeScreenshot;

public class Steps {
    private MyActions myActions = new MyActions();

    @Given("^'(.*)' page is displayed$")
    public void pageIsDisplayed(String pageName) throws Exception {
        Assertions.pageIsDisplayed(pageName);
    }

    @When("^user clicks '(.*)'( button|)$")
    public void click(String webElementName, String elem) throws Exception {
        if (elem.equalsIgnoreCase(" button"))
            myActions.forceClick(webElementName);
        else
            myActions.click(webElementName);
        takeScreenshot(getScreenShotFlag());
    }

    @When("^user enters the following values:$")
    public void userEntersTheFollowingValues(DataTable params) {
        myActions.inputDataTable(params);
        takeScreenshot(getScreenShotFlag());
    }

    @And("^user chooses '(.*)' for '(.*)'$")
    public void userChoosesForLocation(String value, String elementName) throws InterruptedException {
        if (elementName.equalsIgnoreCase("destination")) {
            myActions.inputDestination(elementName, value);
        } else {
            myActions.inputDestination(elementName, value);
        }
        takeScreenshot(getScreenShotFlag());
    }

    @And("^user sets '(.*)' date for '(.*)'$")
    public void userSetsDateForDepartCalendar(String value, String elementName) throws Exception {
        myActions.inputFlightsDate(elementName, value);
        takeScreenshot(getScreenShotFlag());
    }

    @Then("^warning '(.*)' is present on the page$")
    public void warningMessageIsPresentOnThePage(WarningMessages warningMessages) throws Exception {
        warningMessageIsDisplayed(warningMessages);
        takeScreenshot(getScreenShotFlag());
    }

    @And("^from the '(.*)' user chooses '(.*)'$")
    public void fromTheDropDownListUserChoosesValue(String element, String value) {
        myActions.dropDownList(element, value);
        takeScreenshot(getScreenShotFlag());
    }

    @And("^user sets '(.*)' person for '(.*)'$")
    public void userSetsPersonForAdults(int number, String name) {
        myActions.setPassengers(number, name);
        takeScreenshot(getScreenShotFlag());
    }

    @When("^user sets the price range$")
    public void userSetsThePriceRange() {
        myActions.dragAndDrop();
    }
}
