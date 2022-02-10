package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B {
	
	@FindBy(xpath="//a[@title='Printed Summer Dress']")
	private WebElement dr;
	
	B(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void sd() {
		dr.click();
	}

}
