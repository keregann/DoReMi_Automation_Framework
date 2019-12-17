package cucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class Steps {
    private MyActions actions = new MyActions();
    // private Assertions assertion = new Assertions();

    @Given("^'(.*)' Page is displayed$")
    public void pageIsDisplayed(String pageName) throws Exception {
        Assertions.pageIsDisplayed(pageName);
    }

    @When("^user clicks '(.*)'$")
    public void click(String webElementName) throws Exception {
        actions.click(webElementName);
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
