package com.endava.framework.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/feature/",
        glue = {"com.endava.framework/cucumber/stepdef",
                "com.endava.framework/cucumber/hook"},
        tags = {"@Ion"},
        plugin = {"pretty", "html:test-output",
                "json:test-output/jsonreport.json"})
public class TestRunner {

}
