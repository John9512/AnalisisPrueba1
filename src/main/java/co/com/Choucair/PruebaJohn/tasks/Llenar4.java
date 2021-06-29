package co.com.Choucair.PruebaJohn.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.Choucair.PruebaJohn.userinterface.Formulario4Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Llenar4 implements Task {
    public static Llenar4 ElFormulario4(String strContrasena) {
        return instrumented(Llenar4.class,strContrasena);
    }

    public Llenar4(String strContrasena) {
        this.strContrasena = strContrasena;
    }

    private String strContrasena;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strContrasena).into(CONTRASENA_CAMPO),
                Enter.theValue(strContrasena).into(CONTRASENA_CAMPO_CONFIRMAR_),
                Click.on(ACEPTAR_TERMINOS),
                Click.on(ACEPTAR_POLITICA_PRIVACIDAD),
                Click.on(BOTON_FINAL)
        );

    }
}
