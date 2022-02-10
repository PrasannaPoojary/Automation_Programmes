package basics;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		Thread.sleep(2000);
		driver.close();

	}

}
