package StepDefination;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Pages.HomePage;
import Util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Homepage extends TestBase
{
		
	@Given("^User navigate on Homepage$")
	public void user_is_on_homepage() throws Throwable 
	{
		ExtentTest loginfo=null;
		try {
		test=extent.createTest(Feature.class,"Check Competetia website HOMEPAGE");
		test=test.createNode(Scenario.class, "Validate the Homepage Global Hearder Component of Inner-Circle site");
		loginfo=test.createNode(new GherkinKeyword("Given"), "User navigate on Homepage");
		
		tb=new TestBase();
		driver=TestBase.initializeDriver();
	    hp=new HomePage(driver);

	    loginfo.pass(" Home page is visible");
	    
		// To add screenshot for each pass test cases.
		loginfo.addScreenCaptureFromPath(CaptureScreenshot(driver));
		
		//Logger
		logger=Logger.getLogger(Homepage.class); //Added logger
		PropertyConfigurator.configure("Log4j.properties");//Added logger
		logger.info("******** Home Page is visible *********");
		
		}catch (AssertionError | Exception ee) {
			// TODO: handle exception
			TestStepHandel("FAIL", driver, loginfo, ee);
		}
	    
	}
	
	
	@Given("^Verifies the Global Header section on Homepage$")
	public void verifies_the_Global_Header_section_on_Homepage() throws InterruptedException
	{
	  hp.verifyBlueribbonText();
	  System.out.println("Homepage Text is validated ");
	  
	}
	
	@Then("^User closed the browser$")
	public void user_closed_the_browser(){
	 
		driver.quit();
		
	}
	
	/*@Then("^Verify the Blue Ribbon$")
	public void verify_teh_Blue_Ribbon() throws Throwable 
	{
		home.verifyBlueribbonText();
	}

	@Then("^Verify the Header links available on homepage$")
	public void verify_the_Header_links_available_on_homepage() throws Throwable
	{
	    
	}

	@Then("^Verify the SIGN UP NOW CTA on Hero Area$")
	public void verify_the_SIGN_UP_NOW_CTA_on_Hero_Area() throws Throwable
	{
	    
	}

	@Then("^Search funcationality from Homepage$")
	public void search_funcationality_from_Homepage() throws Throwable
	{
	    
	}

	@Then("^Verify the list of job displayed under search bar$")
	public void verify_the_list_of_job_displayed_under_search_bar() throws Throwable
	{
	    
	}

	@Then("^verifty CTA texts for Request to become referrer and Leran more and Sign up to become a referrer$")
	public void verifty_CTA_texts_for_Request_to_become_referrer_and_Leran_more_and_Sign_up_to_become_a_referrer() throws Throwable 
	{
	    
	}

	@Then("^verify the Sign up funactionality from homepage footer$")
	public void verify_the_Sign_up_funactionality_from_homepage_footer() throws Throwable 
	{
	    
	}*/
	
	
}
