package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test0 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.id("container_reports")).click();
		Thread.sleep(2000);
		driver.close();
	
	}
}

