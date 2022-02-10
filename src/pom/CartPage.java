package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement CartBtn;
	
	CartPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void AddingtoCart()
	{
		CartBtn.click();
	}
		

}

