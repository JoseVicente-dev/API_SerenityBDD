package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"date",
"states",
"cases",
"testing",
"outcomes"
})
public class Data {

@JsonProperty("date")
private String date;
@JsonProperty("states")
private int states;
@JsonProperty("cases")
private Cases cases;
@JsonProperty("testing")
private Testing testing;
@JsonProperty("outcomes")
private Outcomes outcomes;

@JsonProperty("date")
public String getDate() {
return date;
}

@JsonProperty("date")
public void setDate(String date) {
this.date = date;
}

@JsonProperty("states")
public int getStates() {
return states;
}

@JsonProperty("states")
public void setStates(int states) {
this.states = states;
}

@JsonProperty("cases")
public Cases getCases() {
return cases;
}

@JsonProperty("cases")
public void setCases(Cases cases) {
this.cases = cases;
}

@JsonProperty("testing")
public Testing getTesting() {
return testing;
}

@JsonProperty("testing")
public void setTesting(Testing testing) {
this.testing = testing;
}

@JsonProperty("outcomes")
public Outcomes getOutcomes() {
return outcomes;
}

@JsonProperty("outcomes")
public void setOutcomes(Outcomes outcomes) {
this.outcomes = outcomes;
}

}