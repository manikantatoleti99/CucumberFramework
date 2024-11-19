package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.loginpage;
import utils.DriverManager;

public class loginDemo{
	
	//public WebDriver driver;
	private WebDriver driver = DriverManager.getDriver();
	loginpage login;
	HomePage homepage;
	
//	@Given("open browsers")
//	public void open_browsers() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();  
//	    
//	}

	@And("launch urls")
	public void launch_urls() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	   
	}

	@When("^login with valid (.*) and (.*)$")
	public void login_with_valid_username_and_Password(String username,String Password) {
		 login =new loginpage(driver);
		 login.enterUsername(username);
		 login.enterpassword(Password);
		 login.clicklogin();
	    
	}
	@Then("Validate user is on login Page")
	public void Validate_user_is_on_login_Page() {
		homepage =new HomePage(driver);
		homepage.clicklogout();
		//driver.close();
	}

}
