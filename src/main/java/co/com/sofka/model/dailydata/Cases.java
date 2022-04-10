package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"total"
})
public class Cases {

@JsonProperty("total")
private Total total;

@JsonProperty("total")
public Total getTotal() {
return total;
}

@JsonProperty("total")
public void setTotal(Total total) {
this.total = total;
}

}