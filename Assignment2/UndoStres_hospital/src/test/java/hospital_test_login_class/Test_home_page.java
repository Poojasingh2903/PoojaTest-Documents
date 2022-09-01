package hospital_test_login_class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hospital_base_class.Base_class;
import hospital_home_page.Book_appointment;
import hospital_home_page.Find_patient;
import hospital_home_page.Home_page;
import hospital_home_page.Register_patient;
import hospital_login_page.Login_page;

public class Test_home_page extends Base_class {
	
	Login_page loginpage;
	Home_page home_page;
	Register_patient register_patient;
	Book_appointment book_appointment;
	Find_patient find_patient;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new Login_page();
		register_patient = new Register_patient();
		book_appointment = new Book_appointment();
		find_patient= new Find_patient();
		
	}
	
	@Test(priority=1)
	public void verify_registerpatient_page() {
		register_patient = home_page.clickon_register_patient();
	}
	
	@Test(priority=2)
	public void verify_bookappointment_page() {
		book_appointment = home_page.clickon_book_appointment();
	}
	
	@Test(priority=3)
	public void verify_findpatient_page() {
		find_patient = home_page.clickon_find_patient();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
