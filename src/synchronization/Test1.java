package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		WebDriverWait Wait =new WebDriverWait(driver, 5);
		Wait.until(ExpectedConditions.titleContains("Enter"));
		

		//WebDriverWait Wait = new WebDriverWait(driver,5);
		//Wait.until(ExpectedConditions.titleContains("Enter"));
		
		String ele= driver.getTitle();
		
		System.out.println(ele);
		Thread.sleep(2000);
		driver.close();
	
	}
}
