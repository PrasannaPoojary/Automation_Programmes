package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele  = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement ele2 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Thread.sleep(2000);
		
		Actions a =new Actions(driver);
		a.dragAndDrop(ele, ele2).perform();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}
}
