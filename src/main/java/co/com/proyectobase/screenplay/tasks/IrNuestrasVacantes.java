package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PaginaMagnetoMenu;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class IrNuestrasVacantes  implements Task {


    public static IrNuestrasVacantes filtrarPorNombreDeEmpleo() {
        return Tasks.instrumented(IrNuestrasVacantes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaMagnetoMenu.NUESTRAS_VACANTES),
                Enter.keyValues("Analista de pruebas en formacion").into(PaginaMagnetoMenu.CAJA_DE_TEXTO),
                Click.on(PaginaMagnetoMenu.BUSCAR));

    }
}
