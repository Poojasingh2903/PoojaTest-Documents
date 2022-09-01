package hospital_login_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hospital_base_class.Base_class;
import hospital_home_page.Home_page;

public class Login_page extends Base_class  {

	
	
////1.page factory 
	
	
	
	@FindBy(xpath=("//input[@id='username']"))
	WebElement username;
	
	@FindBy(xpath=("//legend[@class='password']"))
	WebElement password;
	
	@FindBy(xpath=("//li[@id='Inpatient Ward']"))
	WebElement inpatient;
	
	@FindBy(xpath=("//input[@id='loginButton']"))
	WebElement loginbutton;
	
	
////2.Initializing the Page Objects:
	
	public Login_page() {
		PageFactory.initElements(driver, Login_page.class);
	}
	
	
////3. verify on the login page 
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public Home_page login() {
		username.sendKeys("Admin");
		password.sendKeys("Admin123");
		inpatient.click();
		loginbutton.click();
		return new Home_page();
		
	}
	
}
