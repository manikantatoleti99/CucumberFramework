package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends BasePage {
	
//	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		super(driver);
//		this.driver=driver;
//		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="username")
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="submit")
	WebElement btn_SignIn;
	
	public void enterUsername(String username) {
		
		txt_username.sendKeys(username);
	}
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	public void clicklogin() {
		btn_SignIn.click();
	}
	public void validloginflow(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_SignIn.click();
		
	}
	

}
