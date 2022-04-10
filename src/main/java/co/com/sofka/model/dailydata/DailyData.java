package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"meta",
"data"
})
public class DailyData {

@JsonProperty("meta")
@JsonIgnore
private Meta meta;
@JsonProperty("data")
private Data data;

@JsonProperty("meta")
@JsonIgnore
public Meta getMeta() {
return meta;
}

@JsonProperty("meta")
@JsonIgnore
public void setMeta(Meta meta) {
this.meta = meta;
}

@JsonProperty("data")
public Data getData() {
return data;
}

@JsonProperty("data")
public void setData(Data data) {
this.data = data;
}

}