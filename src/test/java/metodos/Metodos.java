package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	
	public void assertMensagem () {
		WebElement texto = driver.findElement(By.xpath("//h2[text()='Sending e-mail success!']"));
		String textoEmail = texto.getText();
		assertEquals("Sending e-mail success!" , textoEmail);
		
	}
	
	
	public void fecharNavegador() {
		driver.quit();
	}

	

}

