package co.com.sofka.model.dailydata;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"field",
"deprecated",
"prior_names"
})
public class FieldDefinition {

@JsonProperty("name")
private String name;
@JsonProperty("field")
private String field;
@JsonProperty("deprecated")
private boolean deprecated;
@JsonProperty("prior_names")
private List<String> priorNames = null;

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("field")
public String getField() {
return field;
}

@JsonProperty("field")
public void setField(String field) {
this.field = field;
}

@JsonProperty("deprecated")
public boolean isDeprecated() {
return deprecated;
}

@JsonProperty("deprecated")
public void setDeprecated(boolean deprecated) {
this.deprecated = deprecated;
}

@JsonProperty("prior_names")
public List<String> getPriorNames() {
return priorNames;
}

@JsonProperty("prior_names")
public void setPriorNames(List<String> priorNames) {
this.priorNames = priorNames;
}

}