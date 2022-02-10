package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test18 {
		static {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
		public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("4.0.0")).click();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);
		driver.close();
		
		}	

}
