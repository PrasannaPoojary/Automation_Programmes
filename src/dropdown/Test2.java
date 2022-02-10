package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		WebElement ele  = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(ele);
		
		s.selectByValue("14339");
		Thread.sleep(2000);
		
		s.selectByIndex(16);
		Thread.sleep(2000);
		
		s.selectByVisibleText("Art");
		Thread.sleep(2000);
		
		System.out.println(s.isMultiple());
		
		driver.close();
	}
}
