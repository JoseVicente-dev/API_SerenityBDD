package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"total"
})
public class Testing {

@JsonProperty("total")
private Total__1 total;

@JsonProperty("total")
public Total__1 getTotal() {
return total;
}

@JsonProperty("total")
public void setTotal(Total__1 total) {
this.total = total;
}

}