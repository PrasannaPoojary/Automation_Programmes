//1 st practice
package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//driver.manage().window().fullscreen();
		//String ele=driver.getTitle();
		//System.out.println(ele);
		//String ele1 =driver.getCurrentUrl();
		//System.out.println(ele1);
		
		Thread.sleep(3000);
		
		
		//driver.quit();
		driver.close();
		
	}

}
