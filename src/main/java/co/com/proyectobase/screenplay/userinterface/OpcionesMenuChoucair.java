package co.com.proyectobase.screenplay.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class OpcionesMenuChoucair {
    public static final Target MENU_EMPLEO = Target.the("Opcion  empleo").located(By.xpath("//a[contains(text(),'Empleos')]"));
}
