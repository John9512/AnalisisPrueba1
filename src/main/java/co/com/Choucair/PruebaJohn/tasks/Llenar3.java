package co.com.Choucair.PruebaJohn.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.Choucair.PruebaJohn.userinterface.Formulario3Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Llenar3 implements Task {
    public static Llenar3 ElFormulario3() {
        return instrumented(Llenar3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTADOR_CAMPO),
                Click.on(COMPUTADOR_CAMPO_WINDOWS),
                Click.on(VERSION_CAMPO),
                Click.on(VERSION_CAMPO_10),
                Click.on(LENGUAGE_CAMPO),
                Click.on(LENGUAGE_CAMPO_ESPANOL),
                Scroll.to(BOTON_PASO_4),
                WaitUntil.the(BOTON_PASO_4, isEnabled()).forNoMoreThan(3).seconds(),
                Click.on(BOTON_PASO_4)
        );
    }
}
