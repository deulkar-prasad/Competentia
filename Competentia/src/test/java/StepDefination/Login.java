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
	
}
