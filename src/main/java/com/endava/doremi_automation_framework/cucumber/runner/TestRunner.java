package com.endava.doremi_automation_framework.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/feature/",
        glue = {"com.endava.doremi_automation_framework/cucumber/stepdef", "com.endava.doremi_automation_framework/cucumber/hook"},
        tags = {"@login"},
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner {

}
