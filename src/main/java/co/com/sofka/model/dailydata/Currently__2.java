package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Currently__2 {

private Long value;
private Calculated__4 calculated;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Long getValue() {
return value;
}

public void setValue(Long value) {
this.value = value;
}

public Calculated__4 getCalculated() {
return calculated;
}

public void setCalculated(Calculated__4 calculated) {
this.calculated = calculated;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}