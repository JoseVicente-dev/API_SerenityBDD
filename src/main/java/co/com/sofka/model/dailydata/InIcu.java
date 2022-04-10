package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"currently"
})
public class InIcu {

@JsonProperty("currently")
private Currently__1 currently;

@JsonProperty("currently")
public Currently__1 getCurrently() {
return currently;
}

@JsonProperty("currently")
public void setCurrently(Currently__1 currently) {
this.currently = currently;
}

}