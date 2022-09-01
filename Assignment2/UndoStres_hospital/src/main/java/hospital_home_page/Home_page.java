package hospital_home_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hospital_base_class.Base_class;
import hospital_login_page.Login_page;

public class Home_page extends Base_class {
	
	
	
////1.page factory 
	
	@FindBy(xpath=("//a[@type='button' and @href='/openmrs/registrationapp/registerPatient.page?appId=referenceapplication.registrationapp.registerPatient']"))
	WebElement register_patient;
	
	@FindBy(xpath=("//a[@type='button' and @href='/openmrs//appointmentschedulingui/home.page']"))
	WebElement book_appointment;
	
	@FindBy(xpath=("//a[@type='button' and @href='/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient']"))
	WebElement find_patient;
	
	
	
////2.Initializing the Page Objects:
	
	public Home_page() {
		PageFactory.initElements(driver, Login_page.class);
	}
	
////3. verify on the login page 	
		
	
	public String validatehomePageTitle(){
		return driver.getTitle();
	}
	
////4. action
	
	public Register_patient clickon_register_patient() {
		register_patient.click();
		return new Register_patient();
		
	}
	

	public Book_appointment clickon_book_appointment() {
		book_appointment.click();
		return new Book_appointment();
		
	}
	
	
	public Find_patient clickon_find_patient() {
		find_patient.click();
		return new Find_patient();
		
	}
	

}
