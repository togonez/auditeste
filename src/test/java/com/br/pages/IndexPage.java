package com.br.pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import com.br.uimaps.IndexMap;

public class IndexPage {
	WebDriver driver;
	IndexMap indexMap = new IndexMap(driver);

	public IndexPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fecharPopUp() throws InterruptedException {
		indexMap.btnFecharModal.click(driver);
		Thread.sleep(2000);
	}

	public String capturaTela() {

		String path;
		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("ddMMyyyy HHmmss").format(dataHoraAtual);

		try {
			WebDriver augmentedDriver = new Augmenter().augment(driver);
			File source = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
			String nomeCompletoDoArquivo = source.getPath();
			String extSource = FilenameUtils.getExtension(nomeCompletoDoArquivo);
			String name = "Página " + driver.getTitle().toString() + " -  " + data + "." + extSource;
			path = "./target/screenshots/" + name;
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			path = "Falha na captura da tela: " + e.getMessage();
		}
		return path;
	}

	public void clicarBotaoQuemSomos() {
		indexMap.btnQuemSomos.click(driver);
		validarTitulo("Quem somos");
	}

	public void clicarBotaoCasesDeSucesso() {
		indexMap.btnCasesDeSucesso.click(driver);
		validarTitulo("Cases de Sucesso");
	}

	public void clicarBotaoTrabalheConosco() {
		indexMap.btnTrabalheConosco.click(driver);
		validarTitulo("Trabalhe Conosco");
	}

	public void clicarBotaoBlog() {
		indexMap.btnBlog.click(driver);
		validarTitulo("Blog");
	}

	public void clicarBotaoContato() {
		indexMap.btnContato.click(driver);
		validarTitulo("Contato");
	}
	public void clicarBotaoTestesAutomatizados() {
		indexMap.btnServicos.click(driver);
		indexMap.btnTestesAutomatizados.click(driver);
		validarTitulo("Testes Automatizados");
	}

	public void clicarBotaoTestesFuncionaisNaoFuncionais() {
		indexMap.btnServicos.click(driver);
		indexMap.btnTestesFuncionaisENaoFuncionais.click(driver);
		validarTitulo("Testes Funcionais Não Funcionais");
	}

	public void clicarBotaoTestesManuais() {
		indexMap.btnServicos.click(driver);
		indexMap.btnTestesManuais.click(driver);
		validarTitulo("Testes Manuais");
	}

	public void clicarBotaoTestesMobile() {
		indexMap.btnServicos.click(driver);
		indexMap.btnTestesMobile.click(driver);
		validarTitulo("Testes Mobile");
	}

	public void clicarBotaoFabricaDeTestes() {
		indexMap.btnServicos.click(driver);
		indexMap.btnFabricaDeTestes.click(driver);
		validarTitulo("Fábrica de Testes");
	}

	public void clicarBotaoConsultoria() {
		indexMap.btnServicos.click(driver);
		indexMap.btnConsultoria.click(driver);
		validarTitulo("Consultoria");
	}

	public void clicarCrowdsourced() {
		indexMap.btnServicos.click(driver);
		indexMap.btnCrowdsourced.click(driver);
		validarTitulo("Crowdsourced Auditeste");
	}

	public void clicarAlocacaoProfissionais() {
		indexMap.btnServicos.click(driver);
		indexMap.btnAlocacaoDeProfissionais.click(driver);
		validarTitulo("Alocação de Profissionais");
	}

	public void clicarAutomacaoProcessos() {
		indexMap.btnServicos.click(driver);
		indexMap.btnAutomacaoDeProcessos.click(driver);
		validarTitulo("Automação de Processos");
	}

	public void validarTitulo(String pagina) {
		try {
			Thread.sleep(1000);
			String tituloSite = driver.getTitle();
			assertEquals(tituloSite, pagina + " - Auditeste");
			System.out.println("[SUCESSO] - Você está na página " + pagina);
		} catch (Exception e) {
			System.out.println("[FALHA] - Falha ao encontrar o titulo da página.");
		}
	}

}
