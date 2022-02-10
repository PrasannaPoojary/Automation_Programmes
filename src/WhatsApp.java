import org.testng.Reporter;
import org.testng.annotations.Test;

public class WhatsApp {
	
	@Test(priority=1,enabled=false)
	
	public void calls()
	{
		Reporter.log("calls",true);
	}
@Test(invocationCount=3)
	
	public void settings()
	{
		Reporter.log("settings",true);
	}
@Test(priority=-1,invocationCount=2)
	
	public void chat()
	{
		Reporter.log("chat",true);
	}
	
	}
