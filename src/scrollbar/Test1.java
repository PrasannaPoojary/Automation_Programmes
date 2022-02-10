package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	// TO SPECIFY THE PATH TO THE SERVER TO THE BROWSER WE USE SYSTEM.SETPROPERTY
	//KEY Indicates specific type of the browser
	//value indicates the path of the driver executable file
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//implicit upcasting 
		//converting sub class information to superclass
		WebDriver driver = new ChromeDriver();
		//thesestatement is used to maximize the window
		driver.manage().window().maximize();
		//get method is used to enter the url
		driver.get("https://www.myntra.com/");
		//here im mentioning implicit wait. to sync the server and application
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//here im finding the element by xpath and
		//return type of find element is webelement
	    WebElement ele = driver.findElement(By.xpath("(//a[@data-reactid='8'])[2]"));
        
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView()",ele);
		Thread.sleep(2000);
			
		driver.findElement(By.linkText("Gift Cards")).click();
	
	Thread.sleep(2000);		
		driver.close();
		
	}

}
