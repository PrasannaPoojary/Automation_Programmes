package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	static {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./driveers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
