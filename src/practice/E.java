package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class E {
	public WebDriver driver;
	@BeforeMethod
	public void open() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
