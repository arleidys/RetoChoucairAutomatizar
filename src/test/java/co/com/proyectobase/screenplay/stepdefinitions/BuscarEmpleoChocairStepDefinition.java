package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.Larespuesta;
import co.com.proyectobase.screenplay.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.regex.Matcher;

public class BuscarEmpleoChocairStepDefinition {

    @Dado("^que Arle quiere ingresar al portal de empleos de choucair$")
    public void queArleQuiereIngresarAlPortalDeEmpleosDeChoucair() {
        OnStage.theActorCalled("Arle").wasAbleTo(Abrir.laPaginaDeChoucair());
    }


    @Dado("^e ingresa a la opcion empleo$")
    public void eIngresaALaOpcionEmpleo() {
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirLaSeccionEmpleo.empleosDeLaPaginaChoucair());
    }

    @Cuando("^ella va a la opcion Ir al portal de empleos$")
    public void ellaVaALaOpcionIrAlPortalDeEmpleos() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrAlPortaDeEmPleos.mostrarPaginaInicioMagnetos());
    }

    @Cuando("^va a Nuestras Vacantes disponibles$")
    public void vaANuestrasVacantesDisponibles() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrNuestrasVacantes.filtrarPorNombreDeEmpleo());
        OnStage.theActorInTheSpotlight().attemptsTo(Ver.descripcionDeLaOferta());
    }

    @Entonces("^ella verifica que el empleo buscado sea el correcto$")
    public void ellaVerificaQueElEmpleoBuscadoSeaElCorrecto() {
        //se agrego esta linea despues que se envio el reto para poder validar la capa question aun esta en implementacion.
             //   OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Larespuesta.es(), Matchers.equalTo("Analista de Pruebas en Formación")));
            }
}
