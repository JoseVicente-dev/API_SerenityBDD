package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"value",
"calculated"
})
public class Currently {

@JsonProperty("value")
private int value;
@JsonProperty("calculated")
private Calculated__2 calculated;

@JsonProperty("value")
public int getValue() {
return value;
}

@JsonProperty("value")
public void setValue(int value) {
this.value = value;
}

@JsonProperty("calculated")
public Calculated__2 getCalculated() {
return calculated;
}

@JsonProperty("calculated")
public void setCalculated(Calculated__2 calculated) {
this.calculated = calculated;
}

}