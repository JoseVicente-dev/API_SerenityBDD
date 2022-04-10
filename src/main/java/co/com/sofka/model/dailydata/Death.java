package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"total"
})
public class Death {

@JsonProperty("total")
private Total__2 total;

@JsonProperty("total")
public Total__2 getTotal() {
return total;
}

@JsonProperty("total")
public void setTotal(Total__2 total) {
this.total = total;
}

}