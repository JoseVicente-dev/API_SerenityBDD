package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Testing {

private Total__1 total;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Total__1 getTotal() {
return total;
}

public void setTotal(Total__1 total) {
this.total = total;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}