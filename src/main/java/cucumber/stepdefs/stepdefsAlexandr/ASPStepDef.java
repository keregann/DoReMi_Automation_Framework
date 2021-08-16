package cucumber.stepdefs.stepdefsAlexandr;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pageObjects.asp.ASPHomePage;

public class ASPStepDef {
    TestContext testContext;
    ASPHomePage homePage;

    public ASPStepDef(TestContext context) {
        testContext = context;
        homePage = testContext.getAspPageObjectManager().getHomePage();
    }

    private static Logger log = Logger.getLogger(ASPStepDef.class);

    @Given("^asp home page is opened$")
    public void aspHomePageIsOpened() {
        homePage.goToHomePage();
    }

    @When("^user (.*) is set$")
    public void serviciuDropdownIsOpened(String data) throws InterruptedException {
        homePage.register();
        System.out.println("breakpoint");
    }
}