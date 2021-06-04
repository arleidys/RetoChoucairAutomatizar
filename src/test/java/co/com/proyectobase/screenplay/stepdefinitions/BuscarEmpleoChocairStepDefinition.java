package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.AbrirLaSeccion;
import co.com.proyectobase.screenplay.tasks.IrAlPortaDeEmPleos;
import co.com.proyectobase.screenplay.userinterface.OpcionDeMenuEmpleo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.lt.Ir;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarEmpleoChocairStepDefinition {

    @Dado("^que Arle quiere ingresar al portal de empleos de choucair$")
    public void queArleQuiereIngresarAlPortalDeEmpleosDeChoucair() {
        OnStage.theActorCalled("Arle").wasAbleTo(Abrir.laPaginaDeChoucair());
    }


    @Dado("^e ingresa a la opcion empleo$")
    public void eIngresaALaOpcionEmpleo() {
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirLaSeccion.empleosDeLaPaginaChoucair());
    }

    @Cuando("^ella va a la opcion Ir al portal de empleos$")
    public void ellaVaALaOpcionIrAlPortalDeEmpleos() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrAlPortaDeEmPleos.mostrarPaginaInicioMagnetos());
    }

    @Cuando("^va a Nuestras Vacantes disponibles$")
    public void vaANuestrasVacantesDisponibles() {

    }

    @Entonces("^ella verifica que el empleo buscado sea el correcto$")
    public void ellaVerificaQueElEmpleoBuscadoSeaElCorrecto() {

    }
}
