package StepDefinition;

import org.openqa.selenium.By;
//import io.cucumber.core.cli.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso abre el navegador google chrome");
	    //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alejandro\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost:8080/ValidaBancoPlatinum/");
	}

	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso ingresa las credenciales de usuario");
		System.out.println("Este paso ingresa el nombre de usuario y contraseña en la pagina de login");
		driver.findElement(By.id("j_idt5:username")).sendKeys(string);
		driver.findElement(By.id("j_idt5:password")).sendKeys(string2);
	}

	@Then("inicia sesion")
	public void inicia_sesion() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo MyTest.feature");
		driver.findElement(By.id("j_idt5:btn_ingresar")).click();
	}

}
