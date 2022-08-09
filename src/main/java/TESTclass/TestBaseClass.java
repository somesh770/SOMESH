package TESTclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import POMclass.POMclass01_LogInPage;
import UTILITYclass.ScreenshotsClass;

public class TestBaseClass 
{
 WebDriver driver;
	
 @BeforeMethod
 public void SetUp() throws IOException, InterruptedException
 {
	System.setProperty("webdriver.chrome.driver", "./DriverFolder/chromedriver.exe");
	
	driver = new ChromeDriver();
	System.out.println("Browser is opened");
	ScreenshotsClass.ScreenshotsOrangeHRM(driver , "browser");
	
	driver.manage().window().maximize();
	System.out.println("Window is maximized");
	ScreenshotsClass.ScreenshotsOrangeHRM(driver , "maximize");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println("implicity wait is appied");
	
	driver.get("https://opensource-demo.orangehrmlive.com");
	System.out.println("OrangeHRM login page opened");
	ScreenshotsClass.ScreenshotsOrangeHRM(driver , "login page");
	 
//===============================================================================	
//log in page	 
	POMclass01_LogInPage loginpage = new POMclass01_LogInPage(driver);
	 
	loginpage.SendUsername();
	System.out.println("OrangeHRM login page opened");
	Thread.sleep(1000);
	ScreenshotsClass.ScreenshotsOrangeHRM(driver , "Username");
	
		
	loginpage.SendPassword();
	System.out.println("OrangeHRM login page opened");
	Thread.sleep(1000);
	ScreenshotsClass.ScreenshotsOrangeHRM(driver , "Password");
		
	loginpage.clickloginbutton();
	System.out.println("OrangeHRM login page opened");
	Thread.sleep(1000);
	ScreenshotsClass.ScreenshotsOrangeHRM(driver , "Home Page");
	
 }
 
//----------------------------------------------------------------------------
 
 @AfterMethod
 public void Teardown() 
 {
	driver.quit();
	System.out.println("browser is closed");
 }
 
}
