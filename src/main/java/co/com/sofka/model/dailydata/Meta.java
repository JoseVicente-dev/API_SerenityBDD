package co.com.sofka.model.dailydata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreType
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"build_time",
"license",
"version",
"field_definitions"
})
public class Meta {

@JsonProperty("build_time")
private String buildTime;
@JsonProperty("license")
private String license;
@JsonProperty("version")
private String version;
@JsonProperty("field_definitions")
private List<FieldDefinition> fieldDefinitions = null;

@JsonProperty("build_time")
public String getBuildTime() {
return buildTime;
}

@JsonProperty("build_time")
public void setBuildTime(String buildTime) {
this.buildTime = buildTime;
}

@JsonProperty("license")
public String getLicense() {
return license;
}

@JsonProperty("license")
public void setLicense(String license) {
this.license = license;
}

@JsonProperty("version")
public String getVersion() {
return version;
}

@JsonProperty("version")
public void setVersion(String version) {
this.version = version;
}

@JsonProperty("field_definitions")
public List<FieldDefinition> getFieldDefinitions() {
return fieldDefinitions;
}

@JsonProperty("field_definitions")
public void setFieldDefinitions(List<FieldDefinition> fieldDefinitions) {
this.fieldDefinitions = fieldDefinitions;
}

}