package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele  = driver.findElement(By.linkText("Fashion"));
		
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();

		
		 driver.findElement(By.linkText("Sneakers")).click();
		 Thread.sleep(2000);
		 driver.close();
			
	}		

}
