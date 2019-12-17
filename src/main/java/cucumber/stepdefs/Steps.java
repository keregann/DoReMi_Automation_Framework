package cucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.ReflectionManager;


public class Steps {
    MyActions actions = new MyActions();

    @Given("^'(.*)' Page is displayed$")
    public void pageIsDisplayed(String pageName) throws Exception {
        //MyAssertions.isDisplayed();
        ReflectionManager.pageInit(pageName);
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
