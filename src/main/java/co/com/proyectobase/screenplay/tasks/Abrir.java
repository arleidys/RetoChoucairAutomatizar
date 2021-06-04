package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.LaPaginaDeInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
private LaPaginaDeInicio laPaginaDeInicio;

    public static Abrir laPaginaDeChoucair() {

        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Open.browserOn(laPaginaDeInicio));
    }


}
