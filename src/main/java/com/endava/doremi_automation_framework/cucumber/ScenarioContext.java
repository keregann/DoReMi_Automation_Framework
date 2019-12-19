package com.endava.doremi_automation_framework.cucumber;

import com.endava.doremi_automation_framework.enums.Context;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    private Map<String, Object> scenarioContext;

    public ScenarioContext() {
        scenarioContext = new HashMap<>();
    }

    public void setContext(Context key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public Object getContext(Context key) {
        return scenarioContext.get(key);
    }

    public Boolean isContains(Context key) {
        return scenarioContext.containsKey(key.toString());
    }
}

//Babysitter kill
//Waiters implicit
//Asserts la final, assertThat(hamcrest)
//Pageobjects - > pageAccessor(findBy page)
//Rename variables, descriptive
//Move logs to /target folder
//Set global variable pageObjects.