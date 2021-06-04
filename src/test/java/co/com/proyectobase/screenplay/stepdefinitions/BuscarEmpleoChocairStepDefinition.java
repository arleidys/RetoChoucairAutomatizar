package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

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
    }

    @Entonces("^ella verifica que el empleo buscado sea el correcto$")
    public void ellaVerificaQueElEmpleoBuscadoSeaElCorrecto() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ver.descripcionDeLaOferta());
            }
}
