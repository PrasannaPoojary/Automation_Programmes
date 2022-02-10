package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele =driver.findElement(By.id("headerContainer"));
		System.out.println(ele.getText());
		System.out.println(ele.getAttribute("id"));
		System.out.println(ele.getSize().getHeight());
		System.out.println(ele.getSize().getWidth());
		System.out.println(ele.getLocation().getX());
		System.out.println(ele.getLocation().getY());
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		Thread.sleep(2000);
		driver.close();
		
		
	}	

}
