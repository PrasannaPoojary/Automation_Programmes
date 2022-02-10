package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test20 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Bahubali");
		Thread.sleep(3000);
	 List<WebElement> ele2 = driver.findElements(By.xpath("//li[@class='sbct']"));
	
	 	System.out.println(ele2.size());
	 	
	 	for(WebElement s:ele2)
	 	{
	 		System.out.println(s.getText());
	 	}
	
	    ele.clear();
	    Thread.sleep(5000);
		 WebElement ele1 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ele1.sendKeys("king",Keys.ENTER);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(4000);
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Photo/king.png");
		
		
		FileUtils.copyFile(src, dest);;
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
