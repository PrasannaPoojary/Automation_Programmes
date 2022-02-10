package dropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
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
		
		List <WebElement> ele1=s.getOptions();
		for(WebElement options:ele1)
		{
			System.out.println(options.getText());
		}
		
		driver.close();
		
		
		

}
}
