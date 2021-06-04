package co.com.proyectobase.screenplay.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/portal_empleos_choucair.feature",
        tags="@CP01",
        glue={"co.com.proyectobase.screenplay.stepdefinitions", "co.com.proyectobase.screenplay.util"},
        snippets=SnippetType.CAMELCASE
)
public class BuscarEmpleoChocairRunner {
}
