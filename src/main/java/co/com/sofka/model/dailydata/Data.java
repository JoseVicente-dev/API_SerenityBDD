package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Data {

private String date;
private Long states;
private Cases cases;
private Testing testing;
private Outcomes outcomes;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public Long getStates() {
return states;
}

public void setStates(Long states) {
this.states = states;
}

public Cases getCases() {
return cases;
}

public void setCases(Cases cases) {
this.cases = cases;
}

public Testing getTesting() {
return testing;
}

public void setTesting(Testing testing) {
this.testing = testing;
}

public Outcomes getOutcomes() {
return outcomes;
}

public void setOutcomes(Outcomes outcomes) {
this.outcomes = outcomes;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}