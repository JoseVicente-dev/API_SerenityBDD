package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"value",
"calculated"
})
public class Total__2 {

@JsonProperty("value")
private int value;
@JsonProperty("calculated")
private Calculated__5 calculated;

@JsonProperty("value")
public int getValue() {
return value;
}

@JsonProperty("value")
public void setValue(int value) {
this.value = value;
}

@JsonProperty("calculated")
public Calculated__5 getCalculated() {
return calculated;
}

@JsonProperty("calculated")
public void setCalculated(Calculated__5 calculated) {
this.calculated = calculated;
}

}