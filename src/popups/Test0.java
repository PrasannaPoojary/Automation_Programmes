package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	static {
		//to specify the of the driver to sever we use system.set Property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		//
		driver.findElement(By.name("B2")).click();
		//to handle the alert popup or to perform action  
		//we need to switch from page to popup
		// and im storing it in the variable a
		Alert a = driver.switchTo().alert();
		//to get the text we use gettext method
		System.out.println(a.getText());
		
		//to click ok we need to use accept method
		//to clic kcancel we need to use dismiss method
		a.accept();
		
		//thee is used to slow down process so we can see the action
		Thread.sleep(2000);
		// these statement is used to close the page
		driver.close();
		
		
	}


}
