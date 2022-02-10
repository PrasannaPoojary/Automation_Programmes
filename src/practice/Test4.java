package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
	static {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele =driver.findElement(By.id("gh-cat"));
		Select s =new Select(ele);
		Thread.sleep(2000);
		s.selectByValue("1249");
		Thread.sleep(2000);
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByVisibleText("Art");
		Thread.sleep(2000);
		System.out.println(s.isMultiple());
		Thread.sleep(2000);
		driver.close();
	}
}
		
		