package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass01_LogInPage 
{
	private WebDriver driver;
	private Actions act;
	
	
//------------------------------------------------------------
//username
	@FindBy(xpath="//span[text()='Username']")
	private WebElement username;
	
	public void SendUsername()
	{
		username.sendKeys("Admin");
	}
//----------------------------------------------------------	
//password
	@FindBy(xpath="//span[text()='Password']")
	private WebElement password;
		
	public void SendPassword()
	{
		
		password.sendKeys("admin123");
	}
//--------------------------------------------------------
//loginbutton
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement loginbutton;
				
	public void clickloginbutton()
	{
		act.click(loginbutton).perform();
	}
	
//------------------------------------------------------
//ForgetPassword
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement ForgetPassword;
				
	public void clickForgetPassword()
	{
		act.click(ForgetPassword).perform();
	}
	
	
//----------------------------------------------------------
// constructor
	public POMclass01_LogInPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver) ;
	}
	

}
