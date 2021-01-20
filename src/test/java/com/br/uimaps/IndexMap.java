package com.br.uimaps;

import org.openqa.selenium.WebDriver;

import com.br.core.Element;
import com.br.enums.ByValue;

public class IndexMap {
	WebDriver driver;
	
	public IndexMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//titulos
	public Element tituloGeral = new Element(driver, ByValue.XPATH, "//*[@id=\"TITULO-SITE\"]/div[1]/div/div/div/h1");

	public Element btnFecharModal = new Element(driver, ByValue.XPATH, "//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img");
	public Element btnHome 		= new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-132\"]/a");
	public Element btnQuemSomos = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-133\"]/a");
	
	//Serviços
	public Element btnServicos = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-290\"]/a");
	public Element btnTestesAutomatizados = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-296\"]/a");
	public Element btnTestesFuncionaisENaoFuncionais = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-293\"]/a");
	public Element btnTestesManuais = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-292\"]/a");
	public Element btnTestesMobile = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-291\"]/a");
	public Element btnFabricaDeTestes = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-294\"]/a");
	public Element btnConsultoria = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-295\"]/a");
	public Element btnCrowdsourced = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-816\"]/a");
	public Element btnAlocacaoDeProfissionais = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-297\"]/a");
	public Element btnAutomacaoDeProcessos = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-772\"]/a");
	
	
	public Element btnCasesDeSucesso = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-392\"]/a");
	public Element btnTrabalheConosco = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-135\"]/a");
	public Element btnBlog = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-1477\"]/a");
	public Element btnContato = new Element(driver, ByValue.XPATH, "//*[@id=\"menu-item-130\"]/a");
	
	
	public Element precos(WebDriver driver, int indice) {
		return new Element(driver, ByValue.XPATH, "//*[@id='table-calcular']/tr[" + indice + "]/td[3]");
	}
}
