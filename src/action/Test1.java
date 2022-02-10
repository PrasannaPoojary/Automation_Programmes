package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele  = driver.findElement(By.linkText("COURSE"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		 driver.findElement(By.linkText("Cucumber")).click();
		 
		 WebElement ele1  = driver.findElement(By.id("add"));
		 a.doubleClick(ele1).perform();
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		
		
	}		

}
