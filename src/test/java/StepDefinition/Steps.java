package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		//Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso abre el navegador google chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darkn\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ced.iplacex.cl/login/index.php");
		
	}
	
	@When("ingresa Rut {String} y username {string}")
	public void ingresa_Rut_y_Username(String string, String string1) {
		//Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso ingresa las credenciales de usuario");
		System.out.println("Este paso ingresa el rut de usuario y username en la pagina de login");
		driver.findElement(By.id("Rut")).sendKeys(string);
		driver.findElement(By.id("username")).sendKeys(string1);
	}
	
	@When("ingresa Password {string}")
	public void ingresa_Password(String string2) {
		//Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso ingresa las credenciales de usuario");
		System.out.println("Este paso ingresa la contraseña en la pagina de login");
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	
	@Then("inicia sesion")
	public void inicia_sesion() {
		//write code here that turns the phrase above into concrete actions
		System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo MyTest.feature");
		driver.findElement(By.id("accion")).click();
	} 

}
