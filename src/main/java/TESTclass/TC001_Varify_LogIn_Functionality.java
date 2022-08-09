package TESTclass;

import org.testng.annotations.Test;

public class TC001_Varify_LogIn_Functionality extends TestBaseClass 
{

	@Test
	public void varifyLoginFunctionality()
	{
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		String ExpectedTitle = "OrangeHRM";
		
	}
}
