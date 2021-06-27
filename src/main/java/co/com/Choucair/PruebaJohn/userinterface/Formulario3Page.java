package co.com.Choucair.PruebaJohn.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Formulario3Page {

    public static final Target COMPUTADOR_CAMPO = Target.the("campo para ingresar el Sistema Operativo").located(By.xpath("//span[contains(text(),'Windows')]"));
    public static final Target COMPUTADOR_CAMPO_WINDOWS = Target.the("opción para ingresar (Windows) en Sistema Operativo").located(By.xpath("//div[contains(text(),'Windows')]"));
    public static final Target VERSION_CAMPO = Target.the("campo para ingresar la version").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target VERSION_CAMPO_10 = Target.the("opción para ingresar (10) en la version").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[19]/span[1]/div[1]"));
    public static final Target LENGUAGE_CAMPO = Target.the("campo para ingresar el lenguaje").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target LENGUAGE_CAMPO_ESPANOL = Target.the("opcion para ingresar (Español) en el lenguaje").located(By.xpath("//div[contains(text(),'Spanish')]"));
    public static final Target BOTON_PASO_4 = Target.the("Click para la siguiente sección (4)").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

}
