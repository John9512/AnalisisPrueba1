package co.com.Choucair.PruebaJohn.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.Choucair.PruebaJohn.userinterface.PrincipalPage.BOTON_JOIN_TODAY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresa implements Task {


    public static Ingresa AlFormulario() {
        return instrumented(Ingresa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(BOTON_JOIN_TODAY)
        );
    }
}
