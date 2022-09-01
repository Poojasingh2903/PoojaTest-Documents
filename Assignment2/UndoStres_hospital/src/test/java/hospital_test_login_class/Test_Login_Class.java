package hospital_test_login_class;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hospital_base_class.Base_class;
import hospital_login_page.Login_page;

public class Test_Login_Class extends Base_class{
	
	Login_page loginpage;
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new Login_page();
		System.out.println("setup done");
	}

	@Test(priority=1)
	public void validating_loginpage() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, true);
		System.out.println("validating login page done");
	}
	
	@Test(priority=2)
	public void login_into_portal() {
		loginpage.login();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("login done");
		
	}
}
