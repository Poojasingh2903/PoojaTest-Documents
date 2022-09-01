package hospital_home_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hospital_base_class.Base_class;


public class Find_patient extends Base_class{
	
	@FindBy(xpath=("//input[@id='patient-search']"))
	WebElement findpatient;
	
	@FindBy(css=("tr.odd:nth-child(1) > td:nth-child(2)"))
	WebElement johntalyorpatient;
	
	
////2.Initializing the Page Objects:
	
	public Find_patient() {
		PageFactory.initElements(driver, Find_patient.class);
	}

	
	public void clickonpatientdetails() {
		findpatient.sendKeys("John Talyor");
		johntalyorpatient.click();
		
		
	}
}
