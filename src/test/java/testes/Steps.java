package testes;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import paginas.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	@Dado("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String site) throws IOException {
		
		metodos.abrirNavegador(site, "FIREFOX", "Abro navegador e o site");

	}

	@Quando("listo os canais")
	public void listo_os_canais() throws IOException, InterruptedException {
		
		metodos.esperarClicavel(el.getClose_span(), "Espero botão fechar ficar clicável");
		metodos.clicar(el.getClose_span(), "Fecho span");
		metodos.esperarClicavel(el.getProgramacao(), "Espero botão programação ficar clicável");
		metodos.clicar(el.getProgramacao(), "Clico em programação");
		metodos.pausa(2000, "Dou pausa para que o botão lista canais fique clicável");
		metodos.clicar(el.getLista_canais(), "Clico em listar canais");
		metodos.preencher(el.getBuscar_canais(), "BANDSPORTS HD", "Busco canal BandSports");

	}

	@Entao("valido o teste")
	public void valido_o_teste() throws IOException {
		
		metodos.validarTexto(el.getBandsports_hd(), "BANDSPORTS HD", "Valido o canal escolhido");
		metodos.screnShoot("Canal buscado");
		metodos.fecharBrowser("Encerro o teste e fecho o navegador");

	}

}
