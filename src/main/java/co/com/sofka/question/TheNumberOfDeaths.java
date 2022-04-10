package co.com.sofka.question;

import co.com.sofka.model.dailydata.DailyData;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheNumberOfDeaths implements Question {


    @Override
    public DailyData answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(DailyData.class);
    }

    public static TheNumberOfDeaths theNumberOfDeaths(){
        return  new TheNumberOfDeaths();
    }
}