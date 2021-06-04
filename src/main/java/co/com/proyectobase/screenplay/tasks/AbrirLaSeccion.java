package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.OpcionesMenuChoucair;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaSeccion implements Task {
    public static AbrirLaSeccion empleosDeLaPaginaChoucair() {
        return Tasks.instrumented(AbrirLaSeccion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OpcionesMenuChoucair.MENU_EMPLEO));
    }
}
