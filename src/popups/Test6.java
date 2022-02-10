package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
		static {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Parent= driver.getWindowHandle();
		System.out.println(Parent);
		
		Set<String> Allid = driver.getWindowHandles();
		System.out.println(Allid);
		
		System.out.println(Allid.size());
		
		String ExpectedResult="Cognizant";
		
		for(String b:Allid) {
			driver.switchTo().window(b);
			
			String ActualTitle =driver.getTitle();
			System.out.println(ActualTitle);
			if(ActualTitle.equals(ExpectedResult)) {
				driver.close();
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
}
}

