package com.endava.framework.cucumber.stepdef;

import com.endava.framework.constant.WarningMessages;
import com.endava.framework.cucumber.Actions;
import com.endava.framework.cucumber.assertion.Assertions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.endava.framework.dataProvider.ConfigFileReader.getScreenShotFlag;
import static com.endava.framework.util.ScreenShotsMaker.takeScreenshot;

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

    @And("^user clicks the '(.*)'$")
    public void userClicksTheCompleteBookingButton(String elementName) throws Exception {
        actions.clickJS(elementName);
    }

    @Then("^warning '(.*)' is present on the page$")
    public void warningMessageIsPresentOnThePage(WarningMessages warningMessages) throws Exception {
        Assertions.warningMessageIsDisplayed(warningMessages);
    }

    @And("^from the '(.*)' user chooses '(.*)'$")
    public void fromTheDropDownListUserChoosesValue(String element, String value) {
        actions.dropDownList(element, value);
    }

    @And("^user sets '(.*)' person for '(.*)'$")
    public void userSetsPersonForAdults(Integer number, String name) {
        actions.setPersons(number, name);
    }
}
