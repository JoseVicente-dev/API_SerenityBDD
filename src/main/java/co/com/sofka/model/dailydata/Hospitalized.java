package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"currently",
"in_icu",
"on_ventilator"
})
public class Hospitalized {

@JsonProperty("currently")
private Currently currently;
@JsonProperty("in_icu")
private InIcu inIcu;
@JsonProperty("on_ventilator")
private OnVentilator onVentilator;

@JsonProperty("currently")
public Currently getCurrently() {
return currently;
}

@JsonProperty("currently")
public void setCurrently(Currently currently) {
this.currently = currently;
}

@JsonProperty("in_icu")
public InIcu getInIcu() {
return inIcu;
}

@JsonProperty("in_icu")
public void setInIcu(InIcu inIcu) {
this.inIcu = inIcu;
}

@JsonProperty("on_ventilator")
public OnVentilator getOnVentilator() {
return onVentilator;
}

@JsonProperty("on_ventilator")
public void setOnVentilator(OnVentilator onVentilator) {
this.onVentilator = onVentilator;
}

}