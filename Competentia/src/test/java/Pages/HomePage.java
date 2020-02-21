package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Util.TestBase;
import Util.WaitHelper;

public class HomePage extends TestBase
{
	public WebDriver Homedriver;
	WaitHelper waithelper;
	
	
	
	//Page factory for HOMEPAGE
	@FindBy(xpath="//div[@class=\"ReferralText\"]")
	WebElement ReferalText;
	
	@FindBy(xpath="(//a[@tabindex='0'])[1]")
	WebElement SingUptext1;
	
	
	@FindBy(xpath="(//img[@class=\"siteLogo\"])[1]")
	WebElement SiteLogo;
			
	@FindBy(xpath="(//*[contains(text(),\"Find Job\")])[1]")
	WebElement FindJob;		
			
			
	@FindBy(xpath="(//*[contains(text(),\"Become a referre\")])[1]")
	WebElement BecomeReferre;	
	
	@FindBy(xpath="(//*[contains(text(),'Log In')])[1]")
	WebElement Login;	
	
	@FindBy(xpath="(//*[contains(text(),'Sign Up')])[1]")
	WebElement Signup;	
	
	
	@FindBy(xpath="(//*[contains(text(),'Sign Up')])[1]")
	WebElement SignupNow;	
			
			
	@FindBy(xpath="(//input[@type=\"text\"])[1]")
	WebElement SearchBar;	
	
			
	@FindBy(xpath="(//*[contains(text(),\"Search\")])[1]")
	WebElement SearchCTA;			
			
	
	@FindBy(xpath="//h3[@class=\"styles__Styledh3-v9y0tl-2 gbAYiX\"]")
	WebElement SearchList;			
	
	
	@FindBy(xpath="(//img[@class=\"siteLogo\"])[2]")
	WebElement SearchListLogo;
	
	
	@FindBy(xpath="//div[@class=\"sc-htpNat gDEcIv\"]")
	WebElement MakeUpTo500;
	
	
	@FindBy(xpath="(//*[contains(text(),\"Refer\")])[2]")
	WebElement ReferCTA;		
			
	@FindBy(xpath="(//*[contains(text(),\"Apply\")])[2]")
	WebElement ApplyCTA;
	
	
	@FindBy(xpath="(//*[contains(text(),\"Show more jobs\")])[1]")
	WebElement ShowMoreJobs;
	
	@FindBy(xpath="(//*[contains(text(),\"Request to become a referrer\")])[1]")
	WebElement RequestaReferCTA;
	
	@FindBy(xpath="(//*[contains(text(),\"Learn more\")])[1]")
	WebElement LearnMoreCTA;
	
	@FindBy(xpath="(//*[contains(text(),\"Sign up to become a referrer\")])[1]")
	WebElement SignuptobecomeareferrerCTA;
	
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement EmailID;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//div[@id=\"checkTerms_icon\"]")
	WebElement CheckBox;
	
	@FindBy(xpath="(//*[contains(text(),'Sign up')])[5]")
	WebElement SignUpCTABOX;
	
	@FindBy(xpath="//*[contains(text(),'Already have an account?')]")
	WebElement AlreadyHaveACC;
	
	
	// --------------- Initializing the page object -----------------------------------------------
		public  HomePage(WebDriver hpdriver) 
			{
				Homedriver=hpdriver;
				PageFactory.initElements(hpdriver, this);
				waithelper=new WaitHelper(Homedriver);
			}
		
// Validations on HOMEPAGE
	
	public String verifyPagetitle()
	{
		return driver.getTitle();
	}
	
	public void verifyBlueribbonText() throws InterruptedException
	{
		Thread.sleep(10000);
		String a=ReferalText.getText();
		Assert.assertEquals("Have you received a referrer invitation? Sign up here", a);
		
		System.out.println("Referral Test is --> " + a);
		
		
		/*String b=SingUptext1.getText();
		Assert.assertEquals("Sign up here", b);*/
	}
	
	public boolean VerifySiteLogo()
	{
		return SiteLogo.isDisplayed();
	}
	
	
	
	
	
}
