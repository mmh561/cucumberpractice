package StepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDeifinitions {
	
	public static ChromeDriver driver;
	
	@Before
	public static void initDriver() {
		driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD Hasan\\Documents\\workspace-sts-3.9.7.RELEASE\\cucumberpractice");
		
	}
	
	
	@Given("open the browser and enter the url")
	public void open_the_browser_and_enter_the_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@When("i enter the username")
	public void i_enter_the_username() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	
	}

	@When("i enter the password")
	public void i_enter_the_password() {
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("i hit the login button")
	public void i_hit_the_login_button() {
		driver.findElement(By.name("Submit")).click();
	
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		String ActuaText= driver.findElement(By.id("welcome")).getText();
		String ExpectedText="Welcome Admin";
		Assert.assertEquals(ActuaText, ExpectedText);

	}

}
