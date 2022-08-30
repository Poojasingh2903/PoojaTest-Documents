package projecttest_demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class RUNDEMOFILE {

	
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
	
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sanbox.undostres.com.mx/"); /// hitting the url
		
		///1. first page where user enters the perator details 
		
		driver.findElement(By.name("mobile")).sendKeys("8465433546");
		Thread.sleep(2000);
	driver.findElement(By.name("operator")).click();
	driver.findElement(By.xpath("//a/div//b[contains(text(),'Telcel')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a/div//b[contains(text(),'$10')]")).click();
	driver.findElement(By.xpath("//button[contains(@class,'button buttonRecharge' )]")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//2. second validating payment page 
	
	boolean payment_page_displayed = driver.findElement(By.xpath("//div[@class='security-text-style']/p")).isDisplayed();
	System.out.println(payment_page_displayed);
	Assert.assertEquals(payment_page_displayed, true);
	System.out.println("you have reached payment page ");
	
	//3.enter the payment card details 
	driver.findElement(By.xpath("//p[text()='Tarjeta']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Usar nueva tarjeta']")).click();
	System.out.println("entering payment details ");
	driver.findElement(By.id("cardnumberunique")).sendKeys("4111111111111111");
	System.out.println("entered card details  ");
	driver.findElement(By.cssSelector(".col-md-4 > input:nth-child(1)")).sendKeys("11");
	driver.findElement(By.cssSelector("div.col-xs-6:nth-child(5) > input:nth-child(1)")).sendKeys("25");
	driver.findElement(By.cssSelector("div.col-xs-5:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("111");
	driver.findElement(By.cssSelector(".email")).sendKeys("test@test.com");
	
	//4.once the card details is filled now hitting the payment button
	
	WebElement payment = driver.findElement(By.cssSelector("#walletPayNowButton > span:nth-child(1)"));
	scrollbyview(payment,driver);
	
	//5. now the pop up details of username and password 
	int insize= driver.findElements(By.tagName("iframe")).size();
	System.out.println(insize);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#usrname")).sendKeys("automationUDT1@gmail.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#psw")).sendKeys("automationUDT123");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	 WebDriverWait webDriverWait = new WebDriverWait(driver, null);
	webDriverWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
	(By.xpath("//iframe[starts-with(@title,'reCAPTCHA') and starts-with(@src, 'https://www.google.com/recaptcha/api2/anchor?ar=1&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&co=aHR0cHM6Ly9zYW5ib3gudW5kb3N0cmVzLmNvbS5teDo0NDM.&hl=en&v=3TZgZIog-UsaFDv31vC4L9R_&size=normal&cb=mb2873s88taj') ]")));
	webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".recaptcha-checkbox-border"))).click();
	
	}

	
	/// function to scroll by view using javascript 
	
	
public static void scrollbyview(WebElement element,WebDriver driver) {
	JavascriptExecutor js =((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true);",element );
	js.executeScript("arguments[0].click();", element);
	
}




}
