package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//a[@title='Printed Summer Dress'])[3]")
	private WebElement dress;
	
	HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void dr() {
		dress.click();
	}

}
