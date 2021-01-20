package com.br.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.br.core.Driver;
import com.br.pages.IndexPage;

public class CT01 {

	WebDriver driver;
	IndexPage indexPage;

	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://www.auditeste.com.br/");
		indexPage = new IndexPage(driver);
	}

	@Test
	public void abrirPaginaQuemSomos() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoQuemSomos();
		indexPage.capturaTela();
	}

	@Test
	public void abrirPaginaCasesDeSucesso() throws Exception {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoCasesDeSucesso();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaTrabalheConosco() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoTrabalheConosco();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaBlog() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoBlog();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaContato() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoContato();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaTestesAutomatizados() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoTestesAutomatizados();
		indexPage.capturaTela();
	}	
	
	@Test
	public void abrirPaginaTestesFuncionaisNaoFuncionais() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoTestesFuncionaisNaoFuncionais();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaTestesManuais() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoTestesManuais();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaTestesMobile() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoTestesMobile();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaFabricaDeTestes() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoFabricaDeTestes();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaConsultoria() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarBotaoConsultoria();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaCrowdsourced() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarCrowdsourced();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaAlocacaoProfissionais() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarAlocacaoProfissionais();
		indexPage.capturaTela();
	}
	
	@Test
	public void abrirPaginaAutomacaoProcessos() throws InterruptedException {
		indexPage.fecharPopUp();
		indexPage.clicarAutomacaoProcessos();
		indexPage.capturaTela();
	}
	
	@After
	public void after() {
		Driver.close(driver);
	}
}
