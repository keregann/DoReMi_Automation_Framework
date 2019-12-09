package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import steps.BaseTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features/Login.feature",
        glue = "steps",
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner extends BaseTest {

}
