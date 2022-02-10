package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test26 {
	@FindBy(id="username")
	private WebElement usernameTb;
	
	
	Test26(WebDriver driver){
		PageFactory.initElements(driver, this);
			
		}
	
	public void demo(String us) {
		usernameTb.sendKeys(us);
	}
	

}
