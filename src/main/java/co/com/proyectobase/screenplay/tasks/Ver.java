package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.VerOferta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ver implements Task {

    public static Ver descripcionDeLaOferta() {
        return Tasks.instrumented(Ver.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(VerOferta.DESCRIPCION_COMPLETA));
    }
}
