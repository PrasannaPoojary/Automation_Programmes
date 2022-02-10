package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//p[text()='Selenium Server (Grid)']"));
		Thread.sleep(5000);
		driver.close();
	}
	


}
