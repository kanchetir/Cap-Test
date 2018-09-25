package steps;


import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Create_A_New_Account;
import pages.Home_Page;
import pages.Login_Page;


public class LoginStepImpl extends BaseUtil{
	
	private BaseUtil base;
	
	public LoginStepImpl(BaseUtil base) {
		
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

	
	@When("^user enter the email address, password$")
	public void user_enter_the_email_address_password() throws Throwable {

		Login_Page lpage = new Login_Page(base.Driver);
		lpage.emailPwd();
	}

	@When("^clicks on Sign in button$")
	public void clicks_on_Sign_in_button() throws Throwable {
	    
		Login_Page lpage = new Login_Page(base.Driver);
		lpage.submit();
	}

	@Then("^user should login to the homepage$")
	public void user_should_login_to_the_homepage() throws Throwable {
	    
		Create_A_New_Account newAcc = new Create_A_New_Account(base.Driver);
		newAcc.RegSuccessful();
		
	}



}
