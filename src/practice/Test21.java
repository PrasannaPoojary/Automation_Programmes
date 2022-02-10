package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement ele  = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(2000);
		
		List <WebElement> ele1=driver.findElements(By.xpath("//li[@class='sbct']"));
		
		
			System.out.println(ele1.size());

			for(WebElement s:ele1)
			{
				System.out.println(s.getText());
			}
		
		driver.close();
		
	}

}

