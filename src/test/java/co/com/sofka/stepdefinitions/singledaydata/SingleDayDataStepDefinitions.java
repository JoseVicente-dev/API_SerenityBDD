package co.com.sofka.stepdefinitions.singledaydata;

import co.com.sofka.stepdefinitions.common.ServiceSetUp;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.log4j.Logger;

public class SingleDayDataStepDefinitions extends ServiceSetUp {

    private static final Logger LOGGER = Logger.getLogger(SingleDayDataStepDefinitions.class);
    private final Actor actor = Actor.named("Jose the CDC analyst");

    @Dado("que como investigador del CDC deseo conocer los datos del {int}-{int}-{int}")
    public void queComoInvestigadorDelCDCDeseoConocerLosDatosDel(Integer year, Integer month, Integer day) {
        try {
            generalSetUp();
            actor.can(CallAnApi.at(BASE_URI));

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    @Cuando("solicite la informacion de casos y muertes")
    public void soliciteLaInformacionDeCasosYMuertes() {
    }

    @Entonces("obtendre las estadisticas del dia")
    public void obtendreLasEstadisticasDelDia() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
