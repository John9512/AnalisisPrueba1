package co.com.Choucair.PruebaJohn.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.Choucair.PruebaJohn.userinterface.InicioPage.BIENVENIDA_USUARIO;

public class Respuesta implements Question<Boolean> {
    public String Pregunta;

    public Respuesta(String Pregunta){
        this.Pregunta = Pregunta;
    }

    public static Respuesta ConfirmarDe(String Pregunta) {
        return new Respuesta(Pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Bienvenida = Text.of(BIENVENIDA_USUARIO).viewedBy(actor).asString();
        if (Pregunta.equals(Bienvenida)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
