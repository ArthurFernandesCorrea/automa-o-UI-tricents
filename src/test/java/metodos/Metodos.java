package metodos;

import org.openqa.selenium.By;

import Drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {

			System.out.println("*** Erro ao escrever no passo " + passo + "***");
			System.out.println("*** Causa do erro  " + e.getCause() + "***");
			System.out.println("*** Mensagem do erro " + e.getMessage() + "***");

		}

	}

	public void clicar(By elemento, String passo) {
		try {
			Thread.sleep(500); // Espera 0,5 segundo
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("*** Erro ao clicar no passo " + passo + "***");
			System.out.println("*** Causa do erro  " + e.getCause() + "***");
			System.out.println("*** Mensagem do erro " + e.getMessage() + "***");
		}
	}
	
	public void clicarOk(By elemento, String passo) {
		try {
			Thread.sleep(10000); // Espera 5 segundos
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("*** Erro ao clicar no passo " + passo + "***");
			System.out.println("*** Causa do erro  " + e.getCause() + "***");
			System.out.println("*** Mensagem do erro " + e.getMessage() + "***");
		}
	}
	
	public void fecharNavegador() {
		driver.quit();
	}

	

}

