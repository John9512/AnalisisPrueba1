package co.com.Choucair.PruebaJohn.tasks;

import co.com.Choucair.PruebaJohn.userinterface.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Task {
    private PrincipalPage principalPage;
    public static Abrir LaPagina() {
        return  instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(principalPage));
    }
}
