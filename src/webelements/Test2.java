package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement ele =driver.findElement(By.id("username"));
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("admin");
		//WebElement ele2 =driver.findElement(By.name("password"));
				//ele2.clear();
				//Thread.sleep(2000);
				//ele2.sendKeys("manager");
				//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
	

}
