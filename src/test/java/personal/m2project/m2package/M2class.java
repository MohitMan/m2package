package personal.m2project.m2package;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class M2class extends CommonMethods
{
	  
	Properties property;
	
	
	
	@Before
	public void initial_load(Scenario scenarioname) throws IOException
	{
		
		property = property_initiate();
		excel_initiate(scenarioname.getName());
		driver = driver_initiate();
	}
	
	@After
    public void embedScreenshot(Scenario s) throws IOException {
        if(s.isFailed()) {
        	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            s.embed(screenshot, "image/png");
        }
        driver.close();
        driver.quit();
    }
	
	WebDriver driver;
	@Given("^URL details for google$")
	public void url_details_for_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(System.getenv("personal.URL") == null)
		{
		driver.get(property.getProperty("personal.URL"));
		}
		else
		{
		driver.get(System.getenv("personal.URL"));
		}
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
	}
		// TODO Auto-generated method stub
		
		
		

}
