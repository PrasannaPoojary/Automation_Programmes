package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		j.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(4000);
		Thread.sleep(2000);
		driver.close();
		
	}

}
