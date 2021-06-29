package co.com.Choucair.PruebaJohn.stepdefinitions;

import co.com.Choucair.PruebaJohn.model.FormularioData;
import co.com.Choucair.PruebaJohn.questions.Respuesta;
import co.com.Choucair.PruebaJohn.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class CreacionUsuarioStepDefinitions {

    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
        theActorCalled("John").wasAbleTo(Abrir.LaPagina());
    }
    @Given("^John quiere crear su usuario en la pagina$")
    public void johnQuiereCrearSuUsuarioEnLaPagina() {
        theActorInTheSpotlight().attemptsTo(Ingresa.AlFormulario());
    }


    @When("^Se llena el formulario de datos pedidos$")
    public void seLlenaElFormularioDeDatosPedidos(List <FormularioData> formularioData) {
        theActorInTheSpotlight().attemptsTo(Llenar1.ElFormulario(formularioData.get(0).getStrUsuario(),formularioData.get(0).getStrApellido(),formularioData.get(0).getStrCorreo(),formularioData.get(0).getStrIdioma()));
        theActorInTheSpotlight().attemptsTo(Llenar2.ElFormulario2(formularioData.get(0).getStrCiudad(),formularioData.get(0).getStrCodigoPostal()));
        theActorInTheSpotlight().attemptsTo(Llenar3.ElFormulario3());
        theActorInTheSpotlight().attemptsTo(Llenar4.ElFormulario4(formularioData.get(0).getStrContrasena()));

    }

    @Then("^Se crea el nuevo usuario satisfactoriamente$")
    public void seCreaElNuevoUsuarioSatisfactoriamente(String Pregunta) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.ConfirmarDe(Pregunta)));
    }
}
