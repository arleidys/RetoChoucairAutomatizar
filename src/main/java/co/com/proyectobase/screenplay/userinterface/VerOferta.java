package co.com.proyectobase.screenplay.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class VerOferta {
    public static final  Target DESCRIPCION_COMPLETA = Target.the("opcion ver oferta completa").located(By.className("outline"));
    public static  final  Target PALABRA_ESPERADA = Target.the("Validar palabra esperada").located(By.xpath("//*[@id=\"v_title_1\"]"));

}
