package co.com.banistmo.certification.stepdefinitions;

import co.com.banistmo.certification.tasks.Descarga;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.banistmo.certification.utils.Constantes.URL;
import static co.com.banistmo.certification.utils.Constantes.YEISON;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DescargaPdfStepDefinitions {

    @Before

    public void preparation() {
        setTheStage(new OnlineCast());
        theActorCalled(YEISON);
        WebDriverManager.chromedriver().setup();

    }
    @Given("^el usuario entra ala pagina de banistmo$")
    public void elUsuarioEntraAlaPaginaDeBanistmo() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }

    @When("^el usuario busca el documento requerido$")
    public void elUsuarioBuscaElDocumentoRequerido() {
        theActorInTheSpotlight().attemptsTo(Descarga.pdf());
    }

    @Then("^el usuario puede ver el pdf$")
    public void elUsuarioPuedeVerElPdf() {

    }

}
