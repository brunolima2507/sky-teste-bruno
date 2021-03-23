package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	// Elementos privados
	
	private By close_span = By.cssSelector("#portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_YQcCxObpxg0J > div > div.portlet-content-container > div > div.clearfix.journal-content-article > div > div > div > div.modal-header.borderless > button");
	private By programacao = By.cssSelector("#main-menu > div.nav-main.container > div.collapse.navbar-collapse.hidden-sm > ul.nav.navbar-nav.menu-link.menu-link-top > li:nth-child(3) > a");
	private By lista_canais = By.cssSelector("#portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_aKJUz209eKa8 > div > div.portlet-content-container > div > div.clearfix.journal-content-article > section > div > div.gadget_title_area.clearfix > div > div > a.btn.btn-title-no-background.pull-right");
	private By buscar_canais = By.id("searchChannel");
	private By bandsports_hd = By.cssSelector("#portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ygJ1muDcDeLt > div > div.portlet-content-container > div > div.clearfix.journal-content-article > section > div > div.list-channel-detail.row > div:nth-child(2) > ul > li:nth-child(2) > div > div.col-xs-7.col-sm-7 > p");
	
	
	// Elementos publicos
	
	public By getClose_span() {
		return close_span;
	}

	public By getLista_canais() {
		return lista_canais;
	}

	public By getBuscar_canais() {
		return buscar_canais;
	}

	public By getBandsports_hd() {
		return bandsports_hd;
	}

	public By getProgramacao() {
		return programacao;
	}

}
