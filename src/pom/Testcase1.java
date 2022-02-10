package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Loginpage l =new Loginpage(driver);
		l.searchbox("dress");
		l.Btn();
		
		HomePage h =new HomePage(driver);
		h.home();
		
		CartPage c = new CartPage(driver);
		c.AddingtoCart();
		
		Thread.sleep(2000);
		driver.close();


}
}

