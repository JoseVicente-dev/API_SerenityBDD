package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Meta {

private String buildTime;
private String license;
private String version;
private List<FieldDefinition> fieldDefinitions = null;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getBuildTime() {
return buildTime;
}

public void setBuildTime(String buildTime) {
this.buildTime = buildTime;
}

public String getLicense() {
return license;
}

public void setLicense(String license) {
this.license = license;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public List<FieldDefinition> getFieldDefinitions() {
return fieldDefinitions;
}

public void setFieldDefinitions(List<FieldDefinition> fieldDefinitions) {
this.fieldDefinitions = fieldDefinitions;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}