package co.com.sofka.model.dailydata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"population_percent",
"change_from_prior_day",
"seven_day_change_percent"
})
public class Calculated {

@JsonProperty("population_percent")
private float populationPercent;
@JsonProperty("change_from_prior_day")
private int changeFromPriorDay;
@JsonProperty("seven_day_change_percent")
private float sevenDayChangePercent;

@JsonProperty("population_percent")
public float getPopulationPercent() {
return populationPercent;
}

@JsonProperty("population_percent")
public void setPopulationPercent(float populationPercent) {
this.populationPercent = populationPercent;
}

@JsonProperty("change_from_prior_day")
public int getChangeFromPriorDay() {
return changeFromPriorDay;
}

@JsonProperty("change_from_prior_day")
public void setChangeFromPriorDay(int changeFromPriorDay) {
this.changeFromPriorDay = changeFromPriorDay;
}

@JsonProperty("seven_day_change_percent")
public float getSevenDayChangePercent() {
return sevenDayChangePercent;
}

@JsonProperty("seven_day_change_percent")
public void setSevenDayChangePercent(float sevenDayChangePercent) {
this.sevenDayChangePercent = sevenDayChangePercent;
}

}