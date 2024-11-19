package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login");
	    
	}

	@When("Login with username and Password")
	public void login_with_username_and_password() {
		System.out.println("user is on pass");
	    
	}

	@And("Click signIn button")
	public void click_sign_in_button() {
		System.out.println("user click signin");
	    
	}

	@Then("Validate user is on login page")
	public void validate_user_is_on_login_page() {
		System.out.println("user is loggedin successfully");
	    
	}

}
