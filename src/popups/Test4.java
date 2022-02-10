package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://html.com/input-type-file/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 
		 driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\HP\\Downloads\\JavaProgrammeing.pdf");
		 Thread.sleep(5000);
		 
		 driver.close();
		

}

}
