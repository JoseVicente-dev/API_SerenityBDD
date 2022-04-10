package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class InIcu {

private Currently__1 currently;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Currently__1 getCurrently() {
return currently;
}

public void setCurrently(Currently__1 currently) {
this.currently = currently;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}