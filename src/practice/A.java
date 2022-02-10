package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A {
	
	@FindBy(id="search_query_top")
	private WebElement st;
	
	@FindBy(name="submit_search")
	private WebElement sb;
	
	A(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void enter(String s)
	{
		st.sendKeys(s);
	}
	public void  ck() {
		sb.click();
	}

}
