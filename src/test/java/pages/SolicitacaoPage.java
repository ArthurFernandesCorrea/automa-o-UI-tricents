package pages;

import elementos.Elementos;
import metodos.Metodos;
import utilities.StringData;

public class SolicitacaoPage {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	StringData sd = new StringData();
	

	// preenchimento do VehicleData
	public void preencherDadosVehicleData() {

		metodo.clicar(el.make, "selecionar marca");
		metodo.escrever(el.engine, sd.engine, "preencher engine");
		metodo.escrever(el.dateMan, sd.dateMan, "preencher date manufacture");
		metodo.clicar(el.numSeats, "selecionar numero de assentos");
		metodo.clicar(el.fuel, "selecionar combustivel");
		metodo.escrever(el.price, sd.price, "preenhcer preco");
		metodo.escrever(el.plate, sd.plate, "preenhcer placa");
		metodo.escrever(el.mileage, sd.mileage, "preenhcer mileage");
		metodo.clicar(el.btnNext1, "clicar no botao next");

	}

//preenchimento do InsurantData
	public void preencherDadosInsurantData() {

		metodo.escrever(el.firstName, sd.firstName, "preenhcer nome");
		metodo.escrever(el.lastName, sd.lastName, "preenhcer sobrenome");
		metodo.escrever(el.dateBirth, sd.dateBirth, "preenhcer dataNascimento");
		metodo.clicar(el.gender, "Selecionar Sexo");
		metodo.escrever(el.street, sd.street, "preenhcer rua");
		metodo.clicar(el.country, "Selecionar País");
		metodo.escrever(el.zipCode, sd.zipCode, "preenhcer CEP");
		metodo.escrever(el.city, sd.city, "preenhcer cidade");
		metodo.clicar(el.occupation, "Selecionar Ocupação");
		metodo.clicar(el.hobbies, "Selecionar Hbbie");
		metodo.escrever(el.website, sd.webSite, "preenhcer website");
		metodo.clicar(el.btnNext2, "Clicar em next");

	}

	// Prenchimento do ProductData
	public void preencherDadosProductData() {

		metodo.escrever(el.startDate, sd.startDate, "preenhcer startDate");
		metodo.clicar(el.sum, "selecionar valor do seguro");
		metodo.clicar(el.merit, "selecioanr bonus");
		metodo.clicar(el.damage, "selecionar tipo de cobertura");
		metodo.clicar(el.optProduct, "Selecionar produto opcional");
		metodo.clicar(el.courtesy, "selecionar carro cortesia");
		metodo.clicar(el.btnNext3, "Clicar em next");

	}

	// Selecionar PriceOption
	public void selecionarPriceOption() {

		metodo.clicar(el.selectPlan, "Selecionar o plano");
		metodo.clicar(el.btnNext4, "Clicar em next");

	}

	// Preencher dados contratante
	public void preencherDadosContratante() {
		metodo.escrever(el.email, sd.email, "preencher campo e email");
		metodo.escrever(el.phone, sd.phone, "preencher campo de telefone");
		metodo.escrever(el.username, sd.username, "preencher usuario");
		metodo.escrever(el.password, sd.password, "preencher senha");
		metodo.escrever(el.confirmPassword, sd.confirmPassword, "preencher senha novamente");
		metodo.escrever(el.comments, sd.comments, "Comentário");
		metodo.clicar(el.btnSend, "Enviar o orçamento por email");
		

	}
	
	public void validarOk() {
		metodo.clicarOk(el.btnConfirm, "clicar no botão confirma");
		
	}

}

