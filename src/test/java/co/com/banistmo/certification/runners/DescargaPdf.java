package co.com.banistmo.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/descarga_documento.feature",
        glue = "co.com.banistmo.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class DescargaPdf {
}
