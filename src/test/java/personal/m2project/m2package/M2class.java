package personal.m2project.m2package;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class M2class extends CommonMethods
{
	  String scenarionamesend;
	Properties property;
	
	
	
	@Before
	public void initial_load(Scenario scenarioname) throws IOException
	{
		
		property = property_initiate();
		excel_initiate(scenarioname.getName());
	}
	
	WebDriver driver;
	@Given("^URL details for google$")
	public void url_details_for_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(property.getProperty("Personal.URL"));		
	}

	@When("^I search anything$")
	public void i_search_anything() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 60);
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		System.out.println(excel_read("Password"));
		driver.findElement(By.id("lst-ib")).sendKeys(excel_read("Password"));
	}

	@Then("^I should see page coordinate$")
	public void i_should_see_page_coordinate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.findElement(By.id("lst-ib")).getLocation());
		System.out.println(driver.findElement(By.id("sfdiv")).getLocation());
		System.out.println(property.getProperty("personal.username"));
		System.out.println(properties.getProperty("personal.password"));
		driver.quit();
	}
		// TODO Auto-generated method stub
		
		
		

}
