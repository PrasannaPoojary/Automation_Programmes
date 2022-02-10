package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C {
	
	 @FindBy(xpath="//span[text()='Add to cart']")
	 private WebElement ac;
	 
	 C(WebDriver driver){
		PageFactory.initElements(driver, this); 
	 }
	
	 
	 public void add() {
		 ac.click();
	 }

}
