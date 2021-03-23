package executar;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		// mostrar o caminho das features
				features = "src/test/resources/feature/",
				// mostrar pacote estão os steps para execução
				glue = "testes",
				//tags para direcionar a execução dos testes
				tags = "@Executa",
				// formatação do console cucumber | report html
				plugin = {"pretty", "html:target/report.html"},
				// monchrome deixa mais limpo o console, sem trazer caracteres especiais
				monochrome = true,
				// Deixa os métodos com padrão da linguagem Java ao invés de underline 
				snippets = SnippetType.CAMELCASE,
				// não executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padrão deixar false
				dryRun = false
				)

public class Executa {

}
