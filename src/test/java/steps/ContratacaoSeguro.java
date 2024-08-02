package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SolicitacaoPage;
import runner.Executa;

public class ContratacaoSeguro {
	
SolicitacaoPage solicitacao = new SolicitacaoPage();
	
	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
	}

	@Given("que esteja na tela de Automobile")
	public void que_esteja_na_tela_de_automobile() {
		Executa.abrirNavegador();
		Executa.selecionarAutomovel();
	}

	
	@When("preencher corretamente todos os campos da aba de VehicleData")
	public void preencher_corretamente_todos_os_campos_da_aba_de_vehicle_data() {
		solicitacao.preencherDadosVehicleData();
	}

	@When("preencher corretamente todos os campos da aba de InsurantData")
	public void preencher_corretamente_todos_os_campos_da_aba_de_insurant_data() {
		solicitacao.preencherDadosInsurantData();

	}

	@When("preencher corretamente todos os campos da aba de ProductData")
	public void preencher_corretamente_todos_os_campos_da_aba_de_product_data() {
		solicitacao.preencherDadosProductData();

	}

	@When("selecionar a opção de preço")
	public void selecionar_a_opção_de_preço() {
		solicitacao.selecionarPriceOption();

	}

	@When("preencher corretamente os dados de contratante e enviar orçamento por email")
	public void preencher_corretamente_os_dados_de_contratante_e_enviar_orçamento_por_email() {
		solicitacao.preencherDadosContratante();

	}

	@Then("validar alerta de envio")
	public void validar_alerta_de_envio() throws InterruptedException {
		solicitacao.validarOk();

	}
	

}


