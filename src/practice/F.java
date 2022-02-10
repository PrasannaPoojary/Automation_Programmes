package practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class F extends E {
	@Test
	public void log() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
