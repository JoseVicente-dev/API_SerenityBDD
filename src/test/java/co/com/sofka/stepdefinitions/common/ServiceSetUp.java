package co.com.sofka.stepdefinitions.common;

import org.apache.log4j.PropertyConfigurator;
import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static co.com.sofka.util.Log4jValues.USER_DIR;

public class ServiceSetUp {

    protected static final String BASE_URI = "https://api.covidtracking.com/v2";
    protected static final String RESOURCE_SINGLE_DAY_DATA = "/us/daily/";
    protected static final String RESOURCE_MAY_7TH_2021=RESOURCE_SINGLE_DAY_DATA+"/2020-03-07.json";

    protected void generalSetUp(){
        setUpLog4j2();
    }

    private void setUpLog4j2(){
        PropertyConfigurator.configure(USER_DIR.getValue()  + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
}
