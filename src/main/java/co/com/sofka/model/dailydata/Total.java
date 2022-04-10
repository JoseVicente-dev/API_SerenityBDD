package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Total {

private Long value;
private Calculated calculated;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Long getValue() {
return value;
}

public void setValue(Long value) {
this.value = value;
}

public Calculated getCalculated() {
return calculated;
}

public void setCalculated(Calculated calculated) {
this.calculated = calculated;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}