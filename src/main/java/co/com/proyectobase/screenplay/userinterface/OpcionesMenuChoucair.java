package co.com.proyectobase.screenplay.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class OpcionesMenuChoucair {
    public static final Target MENU_EMPLEO = Target.the("Opcion  empleo").located(By.xpath("//a[contains(text(),'Empleos')]"));
    public static final Target PREPARARSE_PARA_APLICAR = Target.the("Opcion preparate para aplicar").located(By.xpath("//a[contains(text(),'Prepararse para aplicar')]"));

}
