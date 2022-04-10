package co.com.sofka.stepdefinitions.singledaydata;

import co.com.sofka.stepdefinitions.common.ServiceSetUp;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.log4j.Logger;
import org.eclipse.jetty.http.HttpStatus;
import org.hamcrest.Matchers;

import static co.com.sofka.question.TheNumberOfCases.theNumberOfCases;
import static co.com.sofka.question.TheNumberOfDeaths.theNumberOfDeaths;
import static co.com.sofka.question.TheResponseCode.theResponseCodeWas;
import static co.com.sofka.task.GetDailyData.getDailyData;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SingleDayDataStepDefinitions extends ServiceSetUp {

    private static final Logger LOGGER = Logger.getLogger(SingleDayDataStepDefinitions.class);
    private final Actor actor = Actor.named("Jose the CDC analyst");

    @Dado("que como investigador del CDC deseo conocer los datos de la pandemia")
    public void queComoInvestigadorDelCDCDeseoConocerLosDatosDeLaPandemia() {
        try {
            generalSetUp();
            actor.can(CallAnApi.at(BASE_URI));

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    @Cuando("solicite la informacion de casos y muertes para el dia {int}-{int}-{int}")
    public void soliciteLaInformacionDeCasosYMuertesParaElDia(Integer year, Integer month, Integer day) {
        try {
            actor.attemptsTo(
                    getDailyData().usingTheResource(RESOURCE_MAY_7TH_2021)
            );
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    @Entonces("obtendre las estadisticas del dia")
    public void obtendreLasEstadisticasDelDia() {

        Integer theNumberOfCases = theNumberOfCases().answeredBy(actor).getData().getCases().getTotal().getValue();
        Integer theNumberOfDeaths = theNumberOfDeaths().answeredBy(actor).getData().getOutcomes().getDeath().getTotal().getValue();

        actor.should(
                seeThat("El codigo de respuesta",theResponseCodeWas(),Matchers.equalTo(HttpStatus.OK_200)),
                seeThat("El numero de casos es mayor que cero",act -> theNumberOfCases,Matchers.greaterThan(0)),
                seeThat("El numero de casos es mayor que cero",act -> theNumberOfDeaths,Matchers.greaterThan(0))

        );
    }
}
