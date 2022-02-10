package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/try%20html/LOC1.html");
		driver.findElement(By.className("c1")).sendKeys("qspiders");
		Thread.sleep(2000);
		driver.close();
	}
}
