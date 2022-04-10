package co.com.sofka.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetDailyData implements Task {

    private String resource;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(resource)
                        .with(
                                requestSpecification -> requestSpecification.relaxedHTTPSValidation()
                        )
        );
    }

    public GetDailyData usingTheResource(String resource) {
        this.resource = resource;
        return this;
    }

    //TODO: escribir metodo dinamico para la fecha y reordenar atributo
    private String date;
    public  GetDailyData fromDate(String date){
        this.date=date;
        return this;
    }

    public static GetDailyData getDailyData(){
        return new GetDailyData();
    }
}