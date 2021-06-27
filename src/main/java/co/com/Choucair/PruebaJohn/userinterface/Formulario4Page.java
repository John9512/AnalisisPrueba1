package co.com.Choucair.PruebaJohn.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Formulario4Page {
    public static final Target CONTRASENA_CAMPO = Target.the("campo para ingresar La nueva contraseña").located(By.id("password"));
    public static final Target CONTRASENA_CAMPO_CONFIRMAR_ = Target.the("campo para confirmar La nueva contraseña").located(By.id("confirmPassword"));
    public static final Target ACEPTAR_TERMINOS = Target.the("Click para aceptar los terminos y condiciones").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));
    public static final Target ACEPTAR_POLITICA_PRIVACIDAD = Target.the("Click para aceptar las políticas de seguridad y privacidad").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));
    public static final Target BOTON_FINAL = Target.the("Click terminar el formulario").located(By.id("laddaBtn"));

}
