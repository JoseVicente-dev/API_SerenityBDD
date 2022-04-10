package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"hospitalized",
"death"
})
public class Outcomes {

@JsonProperty("hospitalized")
private Hospitalized hospitalized;
@JsonProperty("death")
private Death death;

@JsonProperty("hospitalized")
public Hospitalized getHospitalized() {
return hospitalized;
}

@JsonProperty("hospitalized")
public void setHospitalized(Hospitalized hospitalized) {
this.hospitalized = hospitalized;
}

@JsonProperty("death")
public Death getDeath() {
return death;
}

@JsonProperty("death")
public void setDeath(Death death) {
this.death = death;
}

}