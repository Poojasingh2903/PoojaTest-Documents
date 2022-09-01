package hospital_base_class;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {

	
	public static WebDriver driver;

	
	
	
	
	
	public static void initialization(){
		
		
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver(); 
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.openmrs.org/openmrs/");
		
	
	}
}
