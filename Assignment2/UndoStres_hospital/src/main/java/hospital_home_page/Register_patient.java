package hospital_home_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hospital_base_class.Base_class;


public class Register_patient extends Base_class  {
	
	
////1.page factory 
	
	
	
	@FindBy(xpath=("//h2"))
	WebElement REGISTER_PATIENT_PAGE;
	
	@FindBy(xpath=("//input[@id='fr1781-field']"))
	WebElement firstname;
	
	@FindBy(xpath=("//input[@id='fr787-field']"))
	WebElement lastname;
	
	@FindBy(xpath=("//span[@id='genderLabel']"))
	WebElement click_on_gender;
	
	@FindBy(xpath=("//option[@value='M']"))
	WebElement click_for_male;
	@FindBy(xpath=("//option[@value='F']"))
	WebElement click_on_female;
	
	@FindBy(xpath=("//span[@id='birthdateLabel']"))
	WebElement click_on_birthdate;
	
	
	@FindBy(xpath=("//span[@id='genderLabel']"))
	WebElement click_on_address;
	
	@FindBy(xpath=("///span[@id='relationships-info_label']"))
	WebElement click_on_relative;
	
	
	@FindBy(xpath=("//span[@id='genderLabel']"))
	WebElement click_on_phonenumber;
	
	@FindBy(xpath=("//span[@id='confirmation_label']"))
	WebElement click_on_confirm;
	
	
	
////2.Initializing the Page Objects:
	
	public Register_patient() {
		PageFactory.initElements(driver, Register_patient.class);
	}
	
////3.validate register page 
	public boolean validateregisterPage(){
		return REGISTER_PATIENT_PAGE.isDisplayed();
	}
	
////actions 
	
	public void Registerpatient() {
		
		firstname.sendKeys("xyz");
		lastname.sendKeys("xyz");
		click_on_gender.sendKeys("xyz");
		click_for_male.sendKeys("xyz");
		click_on_female.sendKeys("xyz");
		click_on_birthdate.sendKeys("xyz");
		click_on_address.sendKeys("xyz");
		click_on_relative.sendKeys("xyz");
		click_on_phonenumber.sendKeys("xyz");
		click_on_confirm.sendKeys("xyz");
		
		
	}

}
