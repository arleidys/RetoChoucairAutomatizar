package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMagnetoMenu {

    public static final Target NUESTRAS_VACANTES = Target.the("Opcion Nuetras Vacantes").located(By.xpath("//*[@id=\"navbarNav\"]/ul/li[3]"));
    public static final Target CAJA_DE_TEXTO=Target.the("opcion Buscar").located(By.name("search[search_query]"));
    public static final Target BUSCAR=Target.the("opcion Buscar").located(By.name("commit"));
}
