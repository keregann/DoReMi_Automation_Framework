package cucumber.stepdefs.stepdefsMargarita;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.apache.log4j.Logger;
import pageObjects.SignUpPage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class SignUpStepdefs {
    private static Logger log = Logger.getLogger(HomePageSteps.class);

    static {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

    PageObjectManager pageObjectManager;
    SignUpPage signUpPage;

    public SignUpStepdefs() {
        pageObjectManager = new PageObjectManager(WebDriverManager.driver);
        signUpPage = pageObjectManager.getSignUpPage();
    }

    @When("^user change the fields by entering value$")
    public void userChangeTheFieldsByEnteringValue(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        System.out.println(list.get(0).get("Password"));
        System.out.println(list.get(0).get("Confirm"));

    }

}
