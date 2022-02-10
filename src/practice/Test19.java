package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");		
	}
	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.naukri.com/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   String Parent = driver.getWindowHandle();
	   System.out.println(Parent);
	   System.out.println("-----------------------");
	   Set<String> All = driver.getWindowHandles();
	   System.out.println(All);
	   System.out.println("-----------------------");
	   System.out.println(All.size());
	   
	   Thread.sleep(2000);
	   String ExpectedTitle ="ICICI";
	   
	  for(String b:All) {
		   driver.switchTo().window(b);
		   String Actual = driver.getTitle();
		   System.out.println(Actual);
		   
		  if(ExpectedTitle.equals(Actual))
		   {
			  driver.close();
		  }
		   
	   }
	   
	   
	   
	}	

}
