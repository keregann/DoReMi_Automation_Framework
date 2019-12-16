package cucumber.stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.BabySitterManager;

import java.util.Date;

public class Steps {

    @Given("^'(.*)' is displayed$") //HomePage
    public void pageIsDisplayed(String pageName) throws Exception {
        BabySitterManager.pageIsDisplayed(pageName);
    }

    @When("^user clicks '(.*)'$")
    public void click(String webElementName) throws Exception {
        BabySitterManager.click(webElementName);
    }

    @When("^user enters the following values:$")
    public void userEntersTheFollowingValues(DataTable table) throws Exception {
        BabySitterManager.enterData(table);
    }

    @Then("^'(.*)' message is displayed$")
    public void warningMessageIsDisplayed(String element) throws Exception {
        BabySitterManager.messageIsDisplayed(element);
    }

    @And("^sets the following date:$")
    public void setsTheFollowingDate(Date date) {
        BabySitterManager.setDate(date);
    }
}
