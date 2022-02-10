package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
	static {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele =driver.findElement(By.name("url"));
		ele.click();
		Select s =new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(10);
		Thread.sleep(2000);
		s.selectByVisibleText("Baby");
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);
		s.isMultiple();
		Thread.sleep(2000);
		driver.close();
		
		
	}
	

}
