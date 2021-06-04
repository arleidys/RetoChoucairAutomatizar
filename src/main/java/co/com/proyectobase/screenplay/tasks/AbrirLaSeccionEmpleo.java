package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.OpcionesMenuChoucair;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AbrirLaSeccionEmpleo implements Task {

    public static AbrirLaSeccionEmpleo empleosDeLaPaginaChoucair() {
        return Tasks.instrumented(AbrirLaSeccionEmpleo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OpcionesMenuChoucair.MENU_EMPLEO),
                Scroll.to(OpcionesMenuChoucair.PREPARARSE_PARA_APLICAR));

    }
}
