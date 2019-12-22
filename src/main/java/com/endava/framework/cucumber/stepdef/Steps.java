package com.endava.framework.cucumber.stepdef;

import com.endava.framework.constant.WarningMessages;
import com.endava.framework.cucumber.MyActions;
import com.endava.framework.cucumber.assertion.Assertions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.endava.framework.dataProvider.ConfigFileReader.getScreenShotFlag;
import static com.endava.framework.util.ScreenShotsMaker.takeScreenshot;

public class Steps {
    private MyActions myActions = new MyActions();

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
        myActions.inputDataTable(params);
    }

    @And("^user chooses '(.*)' for '(.*)'$")
    public void userChoosesForLocation(String value, String elementName) throws InterruptedException {
        myActions.inputLocation(elementName, value);
    }

    @And("^user sets '(.*)' date for '(.*)'$")
    public void userSetsDateForDepartCalendar(String value, String elementName) throws Exception {
        myActions.inputFlightsDate(elementName, value);
    }

    @And("^user clicks the '(.*)'$")
    public void userClicksTheCompleteBookingButton(String elementName) throws Exception {
        myActions.clickJS(elementName);
    }

    @Then("^warning '(.*)' is present on the page$")
    public void warningMessageIsPresentOnThePage(WarningMessages warningMessages) throws Exception {
        Assertions.warningMessageIsDisplayed(warningMessages);
    }

    @And("^from the '(.*)' user chooses '(.*)'$")
    public void fromTheDropDownListUserChoosesValue(String element, String value) {
        myActions.dropDownList(element, value);
    }

    @And("^user sets '(.*)' person for '(.*)'$")
    public void userSetsPersonForAdults(int number, String name) {
        myActions.setPassengers(number, name);
    }

    @When("^user sets the price range$")
    public void userSetsThePriceRange() {
        myActions.dragAndDrop();
    }
}
