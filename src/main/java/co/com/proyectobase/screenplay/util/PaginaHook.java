package co.com.proyectobase.screenplay.util;


import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PaginaHook {
	
	@Before
	public void sepUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
}
