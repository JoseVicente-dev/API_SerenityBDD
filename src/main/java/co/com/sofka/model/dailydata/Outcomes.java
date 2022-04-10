package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Outcomes {

private Hospitalized hospitalized;
private Death death;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Hospitalized getHospitalized() {
return hospitalized;
}

public void setHospitalized(Hospitalized hospitalized) {
this.hospitalized = hospitalized;
}

public Death getDeath() {
return death;
}

public void setDeath(Death death) {
this.death = death;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}