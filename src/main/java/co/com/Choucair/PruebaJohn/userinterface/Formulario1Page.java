package co.com.Choucair.PruebaJohn.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Formulario1Page {
    public static final Target NOMBRE_CAMPO = Target.the("campo para ingresar el nombre del usuario").located(By.id("firstName"));
    public static final Target APELLIDO_CAMPO = Target.the("campo para ingresar el Apellido del usuario").located(By.id("lastName"));
    public static final Target EMAIL_CAMPO = Target.the("campo para ingresar el Email del usuario").located(By.id("email"));
    public static final Target FECHA_NACIMIENTO_MES = Target.the("Lista desplegable para elegir mes de nacimiento").located(By.xpath("//select[@id='birthMonth']/option[13]"));
    public static final Target FECHA_NACIMIENTO_DIA = Target.the("selección mes de nacimiento").located(By.xpath("//select[@id='birthDay']/option[3]"));
    public static final Target FECHA_NACIMIENTO_ANO = Target.the("selección año de nacimiento").located(By.xpath("//select[@id='birthYear']/option[10]"));
    public static final Target IDIOMA = Target.the("selección de idioma").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[5]/div[2]/div[1]/input[1]"));
    public static final Target IDIOMA_ESP = Target.the("selección de idioma español").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[5]/div[2]/ul[1]/li[1]/div[3]/span[1]/div[1]\n"));
    public static final Target BOTON_PASO_2 = Target.the("Click para la siguiente sección").located(By.xpath("//span[contains(text(),'Next: Location')]"));

}


