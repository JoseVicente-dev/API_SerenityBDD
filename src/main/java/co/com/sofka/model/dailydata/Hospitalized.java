package co.com.sofka.model.dailydata;

import java.util.HashMap;
import java.util.Map;

public class Hospitalized {

private Currently currently;
private InIcu inIcu;
private OnVentilator onVentilator;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Currently getCurrently() {
return currently;
}

public void setCurrently(Currently currently) {
this.currently = currently;
}

public InIcu getInIcu() {
return inIcu;
}

public void setInIcu(InIcu inIcu) {
this.inIcu = inIcu;
}

public OnVentilator getOnVentilator() {
return onVentilator;
}

public void setOnVentilator(OnVentilator onVentilator) {
this.onVentilator = onVentilator;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}