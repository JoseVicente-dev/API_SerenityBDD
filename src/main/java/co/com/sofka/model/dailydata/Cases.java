package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Cases {

private Total total;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Total getTotal() {
return total;
}

public void setTotal(Total total) {
this.total = total;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}