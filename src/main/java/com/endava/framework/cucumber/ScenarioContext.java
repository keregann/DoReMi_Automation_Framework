package com.endava.framework.cucumber;

import com.endava.framework.constant.Context;

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
