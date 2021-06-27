package co.com.Choucair.PruebaJohn.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPage {
    public static final Target BIENVENIDA_USUARIO = Target.the("titulo de bienvenida para el usuario nuevo").located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));
}
