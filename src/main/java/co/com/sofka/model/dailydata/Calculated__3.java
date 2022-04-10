package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Calculated__3 {

private Double populationPercent;
private Long changeFromPriorDay;
private Double sevenDayChangePercent;
private Long sevenDayAverage;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Double getPopulationPercent() {
return populationPercent;
}

public void setPopulationPercent(Double populationPercent) {
this.populationPercent = populationPercent;
}

public Long getChangeFromPriorDay() {
return changeFromPriorDay;
}

public void setChangeFromPriorDay(Long changeFromPriorDay) {
this.changeFromPriorDay = changeFromPriorDay;
}

public Double getSevenDayChangePercent() {
return sevenDayChangePercent;
}

public void setSevenDayChangePercent(Double sevenDayChangePercent) {
this.sevenDayChangePercent = sevenDayChangePercent;
}

public Long getSevenDayAverage() {
return sevenDayAverage;
}

public void setSevenDayAverage(Long sevenDayAverage) {
this.sevenDayAverage = sevenDayAverage;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}