package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele =driver.findElement(By.xpath("//a[text()='COURSE']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		Thread.sleep(5000);
		WebElement ele1 =driver.findElement(By.id("add"));
	    a.doubleClick(ele1).perform();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
	    Alert s = driver.switchTo().alert();
	    s.dismiss();
		
		Thread.sleep(5000);
		driver.close();
	}

}
