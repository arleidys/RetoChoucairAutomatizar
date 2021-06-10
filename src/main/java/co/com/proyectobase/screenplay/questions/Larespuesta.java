package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.VerOferta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Larespuesta  implements Question<String> {

    public static Larespuesta es() {
        return new Larespuesta();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VerOferta.PALABRA_ESPERADA).viewedBy(actor).asString();
    }

}
