package co.com.Choucair.PruebaJohn.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.Choucair.PruebaJohn.userinterface.Formulario1Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Llenar1 implements Task {

    public static Llenar1 ElFormulario(String strUsuario, String strApellido, String strCorreo, String strIdioma) {
        return  instrumented(Llenar1.class,strUsuario,strApellido,strCorreo,strIdioma);
    }

    public Llenar1(String strUsuario, String strApellido, String strCorreo, String strIdioma) {
        this.strUsuario = strUsuario;
        this.strApellido = strApellido;
        this.strCorreo = strCorreo;
        this.strIdioma = strIdioma;
    }

    private String strUsuario;
    private String strApellido;
    private String strCorreo;
    private String strIdioma;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strUsuario).into(NOMBRE_CAMPO),
                Enter.theValue(strApellido).into(APELLIDO_CAMPO),
                Enter.theValue(strCorreo).into(EMAIL_CAMPO),
                Click.on(FECHA_NACIMIENTO_MES),
                Click.on(FECHA_NACIMIENTO_DIA),
                Click.on(FECHA_NACIMIENTO_ANO),
                Enter.theValue(strIdioma).into(IDIOMA),
                Click.on(IDIOMA_ESP)
                ,Click.on(BOTON_PASO_2)

        );

    }
}
