package StepDefination;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.log4j.Logger;

import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Pages.LoginPage;
import Pages.WelcomePage;
import Util.TestBase;
import cucumber.api.java.en.*;

public class Login extends TestBase 
{
	
	
	
	@Given("^User launch Chrome browser$")
	public void user_launch_Chrome_browser() throws Throwable 
	{
		
		ExtentTest loginfo=null;
		try {
		test=extent.createTest(Feature.class,"Check Competetia website login and forgot password functionality");
		test=test.createNode(Scenario.class, "Login Test for Referrer User");
		loginfo=test.createNode(new GherkinKeyword("Given"), "User_launch_Chrome_browser");
		
		tb=new TestBase();
		driver=TestBase.initializeDriver();
		lp=new LoginPage(driver);
		wp=new WelcomePage(driver);
		
		loginfo.pass("Opened Chrome browser and entered URL");
		
		// To add screenshot for each pass test cases.
		loginfo.addScreenCaptureFromPath(CaptureScreenshot(driver));
		
		//Logger
		logger=Logger.getLogger(Login.class); //Added logger
		PropertyConfigurator.configure("Log4j.properties");//Added logger
		logger.info("******** Launching browser  *********");
		
		}catch (AssertionError | Exception ee) {
			// TODO: handle exception
			TestStepHandel("FAIL", driver, loginfo, ee);
		}
		
	}

	@Then("^User Clicks on Login CTA from homepage$")
	public void user_Clicks_on_Login_CTA_from_homepage() throws Throwable {
	    
		ExtentTest loginfo=null;
		try {
		loginfo=test.createNode(new GherkinKeyword("Then"), "User Clicks on Login CTA from homepage");
		lp.ClickLoginCTA();	
		loginfo.pass("User Clicked on Login CTA from Home Page");
		
		}catch (AssertionError | Exception ee) {
			// TODO: handle exception
			TestStepHandel("FAIL", driver, loginfo, ee);
		}
		
		logger.info("******** User Clicked on Login CTA from Home Page *********");
	}

	@Then("^User enters Email id as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_Email_id_as_and_password_as(String un, String pwd) throws Throwable {
	   
		ExtentTest loginfo=null;
		try {
		loginfo=test.createNode(new GherkinKeyword("Then"), "User Enters Valid Referrer Username and Password");
		lp.login(un, pwd);
		loginfo.pass("User Entered Referrer user credentials");
		
		}catch (AssertionError | Exception ee) {
			// TODO: handle exception
			TestStepHandel("FAIL", driver, loginfo, ee);
		}
		
		logger.info("*** User Entered Referrer Username and password ****");
		
	}

	@Then("^User clicks on LoginCTA from pop-up$")
	public void user_clicks_on_LoginCTA_from_pop_up() throws Throwable {
		
		ExtentTest loginfo=null;
		try {
		loginfo=test.createNode(new GherkinKeyword("Then"), "User clicks on LoginCTA from pop-up");
		lp.ClickLoginpopup();
	    Thread.sleep(10000);
		loginfo.pass("User Cliked on Login CTA from Pop-up");
		
		}catch (AssertionError | Exception ee) {
			// TODO: handle exception
			TestStepHandel("FAIL", driver, loginfo, ee);
		}
		
		logger.info("*** User clicked on LoginCTA from Login Pop-up ****");
	 }
	
	@Then("^User navigates on Welcome page with page title as \"([^\"]*)\"$")
	public void user_navigates_on_Welcome_page_with_page_title_as(String Welcomepagetitle) throws Throwable
		{
	   
			ExtentTest loginfo=null;
			try
			{
				
				loginfo=test.createNode(new GherkinKeyword("Then"),"User navigates on Welcome page");
				String s1= driver.getTitle();
				Assert.assertEquals(Welcomepagetitle, s1);
				loginfo.pass("Page Title validated on Welcome page");
				
			}catch (AssertionError | Exception ee) {
				// TODO: handle exception
				TestStepHandel("FAIL", driver, loginfo, ee);
			}
		
		
		}
	
	@Then("^Referre dashboard should be displayed$")
	public void user_should_view_the_referre_s_dashboard() throws Throwable {
	    wp.ReferrerView();
	}
	
	
	@Then("^User close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.quit();
	}

	@Then("^Normal dashboard should be displayed$")
	public void normal_dashboard_should_be_displayed() throws Throwable {
	    wp.NormalUserView();
	}
	
	//---------------------- Steps Definations for Forgot Password -------------------
	
	
	@Then("^User clicks on forgot password link$")
	public void user_clicks_on_forgot_password_link() throws Throwable
	{
		lp.ClickonForgotpwd();
		  Thread.sleep(10000);
		
	}

	@Then("^Pop-up heading should displayed as \"([^\"]*)\"$")
	public void pop_up_heading_should_displayed_as(String arg1) throws Throwable 
	{
		lp.VerifyForgotpwdTitle();
	}

	@Then("^User enters registered emailid as \"([^\"]*)\"$")
	public void user_enters_registered_emailid_as(String email) throws Throwable 
	{
	
		lp.EnterEmail(email);
	}

	@When("^User clicks on reset password CTA$")
	public void user_clicks_on_reset_password_CTA() throws Throwable 
	{
		lp.ClickReserPwd();
	}

	@Then("^User prompt with confirmation message$")
	public void user_prompt_with_confirmation_message() throws Throwable 
	{
	  lp.Confirmation();
	}

	@When("^User clicks on Got it CTA$")
	public void user_clicks_on_Got_it_CTA() throws Throwable 
	{
	
	     lp.ClickGotItCTA();
	
	}

	@Then("^User navigate back to homepage$")
	public String user_navigate_back_to_homepage() throws Throwable 
	{
		String hompageTitle = driver.getTitle();
		Assert.assertEquals("Inner Circle : Competentia - Experience the Difference", hompageTitle);
		return hompageTitle;
	}

	@Then("^User enters invalid email-id as \"([^\"]*)\"$")
	public void user_enters_invalid_email_id_as(String email) throws Throwable 
	{
		
		lp.EnterEmail(email);
	}

	
	@Then("^User prompt with Error message as \"([^\"]*)\"$")
	public void user_prompt_with_Error_message_as(String arg1) throws Throwable 
	{
		lp.VerifyErrorMsg();
	}

	@When("^User clicks on Cancel CTA$")
	public void user_clicks_on_Cancel_CTA() throws Throwable 
	{
	   lp.ClickCancel();
	
	}

	
	
}
