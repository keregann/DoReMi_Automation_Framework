package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import drivermanager.BaseDriver;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/SignIn",
        glue = "cucumber/stepdefs",
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner extends BaseDriver {

}
