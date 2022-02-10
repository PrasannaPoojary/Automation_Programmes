package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	A a = new A(driver);
	a.enter("dress");
	a.ck();
	
	B b = new B(driver);
	b.sd();
	
	C c = new C(driver);
	c.add();
	
	Thread.sleep(2000);
	driver.close();
	
	
	}

}
