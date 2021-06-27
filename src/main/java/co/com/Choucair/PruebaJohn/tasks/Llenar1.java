package co.com.Choucair.PruebaJohn.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.Choucair.PruebaJohn.userinterface.Formulario1Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Llenar1 implements Task {

    public static Llenar1 ElFormulario() {
        return  instrumented(Llenar1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("John").into(NOMBRE_CAMPO),
                Enter.theValue("Cabrera").into(APELLIDO_CAMPO),
                Enter.theValue("jmariocaso9512@hotmail.com").into(EMAIL_CAMPO),
                Click.on(FECHA_NACIMIENTO_MES),
                Click.on(FECHA_NACIMIENTO_DIA),
                Click.on(FECHA_NACIMIENTO_ANO),
                Enter.theValue("Spanish").into(IDIOMA),
                Click.on(IDIOMA_ESP),
                Click.on(BOTON_PASO_2)

        );

    }
}
