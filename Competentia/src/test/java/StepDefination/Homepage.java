package StepDefination;

import Pages.HomePage;
import Util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Homepage extends TestBase
{
	HomePage home=new HomePage();
		
	@Given("^User navigate on Homepage$")
	public void user_is_on_homepage() throws Throwable 
	{
	    TestBase.initializeDriver();
	    
	}
	
	@Then("^Verify teh Blue Ribbon$")
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
	    
	}
	
	
}
