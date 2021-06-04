package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpcionDeMenuEmpleo {

    public static final Target IR_PORTAL_EMPLEO = Target.the("Opcion Ir al Portal de Empleos").located(By.xpath("//div[@id=\"content\"]/div/div/div/div/div/section[3]/div/div/div[2]/div/div/div/div/div/a/span/span"));
   public static final Target CONTINUAR= Target.the("Continuar").located(By.className("elementor-button-link elementor-button elementor-size-sm"));
}
