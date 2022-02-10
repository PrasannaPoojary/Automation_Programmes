package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/try%20html/LOC1.html");
		//driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input[name='n1']")).sendKeys("mavanma");
		Thread.sleep(5000);
		driver.close();
	}
	

}
