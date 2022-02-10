package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {
	
	@Test(priority=1)
	public void demo() {
		Reporter.log("selenium",true);
	}
	
	@Test(invocationCount=3,enabled=false)
	public void call() {
		Reporter.log("calls", true);
	}
	
	@Test(priority=-1)
	public void chat() {
		Reporter.log("chat",false);
	}

}
