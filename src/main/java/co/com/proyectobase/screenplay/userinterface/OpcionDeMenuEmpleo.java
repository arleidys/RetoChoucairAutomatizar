package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpcionDeMenuEmpleo {
    public static final Target IR_PORTAL_EMPLEO=Target.the("Opcion Ir al Portal de Empleos").located(By.xpath("//span[text()='Ir al portal de empleos']//ancestor::div[@class='elementor-section-wrap']//section[contains(@class,'elementor-section-boxed')][1]//span[text()='Ir al portal de empleos']"));
    public static final Target CONTINUAR=Target.the("Opcion Continuar").located(By.xpath("//div[@class=\"dialog-widget-content dialog-lightbox-widget-content animated\"]/div[2]/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/div/a"));
}