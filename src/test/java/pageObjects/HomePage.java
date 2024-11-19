package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
//		this.driver=driver;
//		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//strong[contains(text(),'Congratulations student. You successfully logged i')]")
	WebElement btn_Logout;
	
	public void clicklogout() {
		btn_Logout.click();
	}
	
	

}
