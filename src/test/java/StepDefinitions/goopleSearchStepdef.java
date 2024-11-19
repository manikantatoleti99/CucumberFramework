package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

public class goopleSearchStepdef {
	
	
	//WebDriver driver= null;
	private WebDriver driver = DriverManager.getDriver();
	
	@Given("Open Browser")
	public void open_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();    
	}

	@And("User is on Google Search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.com/");

	}

	@When("User enters a text")
	public void user_enters_a_text() throws InterruptedException {
	   driver.findElement(By.name("q")).sendKeys("automation step by step");
	   Thread.sleep(2000);
	}

	@And("Clicks search")
	public void clicks_search() {
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	}

	@Then("Validate user is search result page")
	public void validate_user_is_search_result_page() {
		driver.getPageSource().contains("Online Courses");
		//driver.close();
	    
	}


}
