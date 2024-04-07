package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import Drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

	@RunWith(Cucumber.class)
	@CucumberOptions(
				features = "src/test/resources",
				tags = "@regressivos",
				glue = "steps",
				dryRun = false,
				monochrome = true,
				snippets = SnippetType.CAMELCASE,
				plugin = {"pretty","html:target/reports-cucumber.html"}
						
			)

	public class Executa extends Drivers {

		public static void abrirNavegador() {
			String url = "https://sampleapp.tricentis.com/101/app.php";
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}

		public static void selecionarAutomovel() {
			By automobile = By.id("nav_automobile");
			driver.findElement(automobile).click();

		}

		public static void fecharNavegador() {
			driver.quit();
		}

	}


