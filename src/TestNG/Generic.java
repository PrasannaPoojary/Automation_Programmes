package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	public WebDriver driver;
	
	@BeforeMethod
	
	public void OpenAppIn() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void ThrowsApp() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
	}
	
	

}
