package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/Desktop/ram.html");
		WebElement ele  = driver.findElement(By.id("udupi"));
		
		Select s = new Select(ele);
		
		s.selectByIndex(4);
		Thread.sleep(2000);
		
		s.selectByValue("222");
		Thread.sleep(2000);
		
		s.selectByVisibleText("idly");
		Thread.sleep(2000);
		
		driver.close();

}
}
