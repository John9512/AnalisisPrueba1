package co.com.Choucair.PruebaJohn.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.Choucair.PruebaJohn.userinterface.Formulario2Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Llenar2 implements Task {
    public static Llenar2 ElFormulario2(String strCiudad, String strCodigoPostal) {
        return instrumented(Llenar2.class,strCiudad,strCodigoPostal);
    }

    public Llenar2(String strCiudad, String strCodigoPostal) {
        this.strCiudad = strCiudad;
        this.strCodigoPostal = strCodigoPostal;
    }

    private String strCiudad;
    private String strCodigoPostal;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.theValue(strCiudad).into(CIUDAD_CAMPO).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Enter.theValue(strCodigoPostal).into(CODIGO_POSTAL_CAMPO),
                Click.on(PAIS_CAMPO),
                Click.on(PAIS_CAMPO_COLOMBIA),
                Scroll.to(BOTON_PASO_3),
                WaitUntil.the(BOTON_PASO_3, isEnabled()).forNoMoreThan(3).seconds(),
                Click.on(BOTON_PASO_3)
        );


    }

}
