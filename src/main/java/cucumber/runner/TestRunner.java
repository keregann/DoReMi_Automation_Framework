package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/",
        glue = "cucumber/stepdefs",
        tags = {"@signup"},
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner {

}
