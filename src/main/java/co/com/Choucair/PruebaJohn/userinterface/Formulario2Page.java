package co.com.Choucair.PruebaJohn.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class Formulario2Page {

    public static final Target CIUDAD_CAMPO = Target.the("campo para ingresar la ciudad del usuario").located(By.id("city"));

    public static final Target CODIGO_POSTAL_CAMPO = Target.the("campo para ingresar el código Postal del usuario").located(By.id("zip"));
    public static final Target PAIS_CAMPO = Target.the("campo para ingresar el País del usuario").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/span[2]"));
    public static final Target PAIS_CAMPO_COLOMBIA = Target.the("campo para ingresar a Colombia en el País del usuario").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[49]/span[1]/div[1]"));
    public static final Target BOTON_PASO_3 = Target.the("Click para la siguiente sección (3)").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}