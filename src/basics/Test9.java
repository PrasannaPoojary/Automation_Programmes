package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String ele = (driver.getPageSource());
	System.out.println(ele);
	
	Thread.sleep(2000);
	driver.close();
	
}
}
