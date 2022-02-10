package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("trainee");
	Thread.sleep(2000);
	driver.close();
}

}
