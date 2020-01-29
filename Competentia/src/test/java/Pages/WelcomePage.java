package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class WelcomePage extends TestBase
{

public WebDriver ldriver;
	
	// -------------- Initializing the page object --------------------------------------
	
	public  WelcomePage(WebDriver rdriver) 
		{
					ldriver=rdriver;
					PageFactory.initElements(rdriver, this);	
		}
	
	//--------------- Page factory for Login flow ------------------------------------------------
	
		@FindBy(xpath="//*[contains(text(),\"YOUR PENDING REFERRALS\")]")
		WebElement YOURPENDINGREFERRALS;
		
		@FindBy(xpath="//*[contains(text(),\"YOUR POTENTIAL EARNINGS\")]")
		WebElement YOURPOTENTIALEARNINGS ;
		
		@FindBy(xpath="//*[contains(text(),\"YOUR TOTAL EARNINGS\")]")
		WebElement YOURTOTALEARNINGS;
		
		
		@FindBy(xpath="//*[contains(text(),\"YOUR PENDING APPLICATIONS\")]")
		WebElement YOURPENDINGAPPLICATIONS;
		
		@FindBy(xpath="//*[contains(text(),\"JOBS YOU HAVE BEEN REFERRED FOR\")]")
		WebElement JOBSYOUHAVEBEENREFERREDFOR;
		
		
		//----------------------- Actions on the page ----------------------------------------
		
		public void ReferrerView()
		
		{
			YOURPENDINGREFERRALS.isDisplayed();
			YOURPOTENTIALEARNINGS.isDisplayed();
			YOURTOTALEARNINGS.isDisplayed();
		}
		
		
		public void NormalUserView()
		
		{
			YOURPENDINGAPPLICATIONS.isDisplayed();
			JOBSYOUHAVEBEENREFERREDFOR.isDisplayed();
			
		}
		
		
		
		
}
