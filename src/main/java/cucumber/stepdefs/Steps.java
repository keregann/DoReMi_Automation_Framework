package cucumber.stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.BabySitterManager;

public class Steps {


    @Given("^'(.*)' is displayed$") //HomePage
    public void pageIsDisplayed(String pageName) throws Exception {
        BabySitterManager.isDisplayed(pageName);
    }

    @When("^user clicks '(.*)'$")
    public void click(String webElementName) throws Exception {
        BabySitterManager.click(webElementName);
    }

    @When("^user enters the following values:$")
    public void userEntersTheFollowingValues(DataTable table) throws Exception {
        BabySitterManager.enterData(table);
    }
}
