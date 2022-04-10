package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Death {

private Total__2 total;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Total__2 getTotal() {
return total;
}

public void setTotal(Total__2 total) {
this.total = total;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}