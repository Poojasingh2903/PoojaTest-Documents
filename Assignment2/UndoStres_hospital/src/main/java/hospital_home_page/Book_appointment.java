package hospital_home_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hospital_base_class.Base_class;


public class Book_appointment extends Base_class {
	
	@FindBy(xpath=("//a[@id='appointmentschedulingui-scheduleProviders-app']"))
	WebElement click_on_managebooking;
	
	@FindBy(xpath=("//input[@class='ng-pristine ng-untouched ng-valid ng-empty']"))
	WebElement click_on_provider;
	
	
	@FindBy(xpath=("//a[@class='ng-binding' and @text='View all types']"))
	WebElement click_on_viewservice;
	
	@FindBy(xpath=("//span[@class='fc-button fc-button-month fc-state-default fc-corner-left fc-corner-right fc-state-active']"))
	WebElement click_on_month;
	
	@FindBy(xpath=("//span[@class='fc-button fc-button-basicDay fc-state-default fc-corner-left fc-corner-right']"))
	WebElement click_on_day;
	@FindBy(xpath=("//span[@class='fc-button fc-button-basicWeek fc-state-default fc-corner-left fc-corner-right']"))
	WebElement click_on_week;
	@FindBy(xpath=("//button[@class='confirm']"))
	WebElement click_on_save;
	
	
	
////2.Initializing the Page Objects:
	
	public Book_appointment() {
		PageFactory.initElements(driver, Book_appointment.class);
	}
	
	public void fill_appointment_details() {
		
		click_on_managebooking.click();
		click_on_provider.sendKeys("john");
		
		Select select = new Select(driver.findElement(By.xpath("//a[@class='ng-binding' and @text='View all types']")));
		select.selectByVisibleText("Gerenal Medicine");
		
		click_on_month.sendKeys("12");
		click_on_day.sendKeys("23");
		click_on_week.sendKeys("23");
		click_on_save.click();
		
		
		
		
		
		
		
	}

}
