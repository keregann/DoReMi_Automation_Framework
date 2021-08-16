package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.drivermanager.BaseDriver;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "cucumber/stepdefs",
        tags = "@Run",
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner extends BaseDriver {

}
