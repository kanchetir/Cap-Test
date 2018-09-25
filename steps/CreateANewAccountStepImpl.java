package steps;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Create_A_New_Account;
import pages.Home_Page;

public class CreateANewAccountStepImpl extends BaseUtil{
	
	private BaseUtil base;
	
	public CreateANewAccountStepImpl(BaseUtil base) {
		
		this.base = base;
	}
	
	@Given("^User enter the url in the browser$")
	public void User_enter_the_url_in_the_browser() throws Throwable {
	 
		base.Driver.navigate().to("http://​automationpractice.com");
		base.Driver.navigate().refresh();
		
	}

	@Given("^user clicks on the Signin link in the homepage$")
	public void user_clicks_on_the_Signin_link_in_the_homepage() throws Throwable {
	    
		Home_Page hpage = new Home_Page(base.Driver);
		hpage.signin();
	}

	@When("^user enter thier email address to create an account$")
	public void user_enter_thier_email_address_to_create_an_account() throws Throwable {
	   
		Create_A_New_Account newAcc = new Create_A_New_Account(base.Driver);
		newAcc.createAnUser();
		
	}

	@When("^provide the relevant user details$")
	public void provide_the_relevant_user_details() throws Throwable {
	   
		Create_A_New_Account newAcc = new Create_A_New_Account(base.Driver);
		newAcc.registerUserDetails();
		
	}

	@When("^click on the Register button$")
	public void click_on_the_Register_button() throws Throwable {
	   
		Create_A_New_Account newAcc = new Create_A_New_Account(base.Driver);
		newAcc.clickOnRegisterLink();
	}

	@Then("^the new account should be created$")
	public void the_new_account_should_be_created() throws Throwable {
	    
		Create_A_New_Account newAcc = new Create_A_New_Account(base.Driver);
		newAcc.RegSuccessful();
		
	}



}
