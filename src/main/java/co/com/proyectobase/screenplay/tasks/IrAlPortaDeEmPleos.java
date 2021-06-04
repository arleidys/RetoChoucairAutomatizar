package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.OpcionDeMenuEmpleo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IrAlPortaDeEmPleos  implements Task {

    public static IrAlPortaDeEmPleos mostrarPaginaInicioMagnetos() {
        return Tasks.instrumented(IrAlPortaDeEmPleos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(OpcionDeMenuEmpleo.IR_PORTAL_EMPLEO),
             Click.on(OpcionDeMenuEmpleo.CONTINUAR));

    }
}
