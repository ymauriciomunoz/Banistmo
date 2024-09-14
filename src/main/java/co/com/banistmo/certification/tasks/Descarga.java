package co.com.banistmo.certification.tasks;

import co.com.banistmo.certification.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static co.com.banistmo.certification.userinterfaces.AprendeFacil.LEGALES;
import static co.com.banistmo.certification.userinterfaces.Legales.FATCA;
import static co.com.banistmo.certification.userinterfaces.Personas.APREDEFACIL;
import static co.com.banistmo.certification.userinterfaces.Personas.COOKIES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Descarga implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(COOKIES),
                Click.on(APREDEFACIL),
                Wait.theSeconds(10),
                Click.on(LEGALES),
                Wait.theSeconds(10),
                Click.on(FATCA)
        );
    }

    public static Descarga pdf() {
        return instrumented(Descarga.class);
    }
}
