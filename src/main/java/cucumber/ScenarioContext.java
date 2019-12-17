package cucumber;

import java.util.HashMap;
import java.util.Map;

import enums.Context;

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
//Set global variable