package Pages;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;
import Util.WaitHelper;

public class LoginPage extends TestBase
{
	
	public WebDriver ldriver;
	
	// For explicit wait for all elements
	WaitHelper waithelper;
	
	// --------------- Initializing the page object -----------------------------------------------
	public  LoginPage(WebDriver rdriver) 
		{
					ldriver=rdriver;
					PageFactory.initElements(rdriver, this);
					waithelper=new WaitHelper(ldriver);
		}
	
	//--------------- Page factory for Login flow ------------------------------------------------
	
	@FindBy(xpath="(//*[contains(text(),'Log In')])[1]")
	WebElement LoginCTAHomepage;
	
	@FindBy(xpath="(//*[contains(text(),\"Log in\")])[1]")
	WebElement popupText;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement username;

	@FindBy(xpath="(//input[@name='password'])[2]")
	WebElement password;
	
	@FindBy(xpath="(//*[contains(text (),'Log in')])[2]")
	WebElement loginCTA;
	
	@FindBy(xpath="//*[contains(text (),'Forgot your password?')]")
	WebElement ForgotPwd;
	
	
	//--------------- Page factory for forgot password flow ------------------------------------------------
	@FindBy(xpath="(//*[contains(text (),'Reset password')])[1]")
	WebElement ResetPwdTitle;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement ResetEmail;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement ResetPwdCTA;
	
	@FindBy(xpath="(//*[contains(text (),'Cancel')])[1]")
	WebElement CancelCTA;
	
	@FindBy(xpath="(//*[contains(text (),'Check your inbox')])[1]")
	WebElement CheckYourInbox;
	
	
	@FindBy(xpath="(//*[contains(text (),'Got it')])[1]")
	WebElement GotItCTA;
	
	//----------------------- Actions on the page ---------------------------------------- 
	
	public void ClickLoginCTA()
	
	{
		// Implemented to wait for element load
		waithelper.Waitforelement(LoginCTAHomepage, 40);
		
		LoginCTAHomepage.click();
		/*JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("arguments[0].click()",LoginCTAHomepage);*/
	}
	
	
	public String ValidatePopuptitle()
	{
		String s=popupText.getText();
		Assert.assertEquals("Log in",s);
		return s;
	
	}
	
	public void login(String un, String pwd) 
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
			
	}
	
	public void ClickLoginpopup()
	{
		
		loginCTA.click();
	}
	
	
	
	
	
	
}
