package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		j.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(4000);
		driver.close();
		
		
	}


}

