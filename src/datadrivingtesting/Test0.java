package datadrivingtesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		
		String url =p.getProperty("url");
		System.out.println(p.get("username"));
		System.out.println(p.get("password"));
		
		System.out.println(url);
		
		driver.get(url);
		
		Thread.sleep(2000);
		driver.close();
	}

}
