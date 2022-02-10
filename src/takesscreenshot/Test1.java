package takesscreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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
		
		driver.get("https://demoapp.skillrary.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele  = driver.findElement(By.linkText("COURSE"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		 driver.findElement(By.linkText("Selenium Training")).click();
		 
		 WebElement ele1  = driver.findElement(By.id("add"));
		 a.doubleClick(ele1).perform();
		 
		 driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		 
		 Thread.sleep(2000);
		 
		 Alert a1 = driver.switchTo().alert();

		 System.out.println(a1.getText()); 
		 Thread.sleep(2000);
		 a1.accept();
		 Thread.sleep(2000);
		 
		 
		 driver.close();
		

}
}