package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldDefinition {

private String name;
private String field;
private Boolean deprecated;
private List<String> priorNames = null;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getField() {
return field;
}

public void setField(String field) {
this.field = field;
}

public Boolean getDeprecated() {
return deprecated;
}

public void setDeprecated(Boolean deprecated) {
this.deprecated = deprecated;
}

public List<String> getPriorNames() {
return priorNames;
}

public void setPriorNames(List<String> priorNames) {
this.priorNames = priorNames;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}