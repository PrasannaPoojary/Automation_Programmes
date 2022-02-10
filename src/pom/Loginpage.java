package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="search_query_top")
	private WebElement SearchTb;
	
	@FindBy(name="submit_search")
	private WebElement goBtn;
	
	Loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void searchbox(String s) {
		SearchTb.sendKeys("Dress");
	}
	public void Btn() {
		goBtn.click();
	}
	


}
