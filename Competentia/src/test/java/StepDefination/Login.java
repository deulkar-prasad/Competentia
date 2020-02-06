package StepDefination;

import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import Pages.LoginPage;
import Pages.WelcomePage;
import Util.TestBase;
import cucumber.api.java.en.*;


public class Login extends TestBase
{
	
	
	public static Logger log=LogManager.getLogger(TestBase.class.getName());
	
	@Given("^User launch Chrome browser$")
	public void user_launch_Chrome_browser() throws Throwable 
	{
		log.info("Driver is initilized");		
		tb=new TestBase();
		driver=tb.initializeDriver();
		lp=new LoginPage(driver);
		wp=new WelcomePage(driver);
		log.info("Driver is initilized");
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrac\\Cucumber Parc\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		lp=new LoginPage(driver);*/
	}

	@Then("^User Clicks on Login CTA from homepage$")
	public void user_Clicks_on_Login_CTA_from_homepage() throws Throwable {
	    log.info("Navigated to Home page");
		lp.ClickLoginCTA();
	}

	@Then("^User enters Email id as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_Email_id_as_and_password_as(String un, String pwd) throws Throwable {
	    lp.login(un, pwd);
	}

	@Then("^User clicks on LoginCTA from pop-up$")
	public void user_clicks_on_LoginCTA_from_pop_up() throws Throwable {
	    lp.ClickLoginpopup();
	    Thread.sleep(10000);
	}
	
	@Then("^User navigates on Welcome page with page title as \"([^\"]*)\"$")
	public void user_navigates_on_Welcome_page_with_page_title_as(String Welcomepagetitle) throws Throwable
		{
	   
			String s1= driver.getTitle();
			Assert.assertEquals(Welcomepagetitle, s1);
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
		
	}

	@Then("^Pop-up heading should displayed as \"([^\"]*)\"$")
	public void pop_up_heading_should_displayed_as(String arg1) throws Throwable 
	{
		lp.VerifyForgotpwdTitle();
	}

	@Then("^User enters registered emailid as \"([^\"]*)\"$")
	public void user_enters_registered_emailid_as(String arg1) throws Throwable 
	{
	
		lp.EnterEmail(arg1);
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
	public void user_enters_invalid_email_id_as(String arg1) throws Throwable 
	{
	
		lp.EnterEmail(arg1);
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
