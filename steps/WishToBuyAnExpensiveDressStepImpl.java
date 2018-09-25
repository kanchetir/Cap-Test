package steps;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Dresses_Page;
import pages.Home_Page;
import pages.Login_Page;

public class WishToBuyAnExpensiveDressStepImpl extends BaseUtil{
	
	private BaseUtil base;
	
	public WishToBuyAnExpensiveDressStepImpl(BaseUtil base) {
		
		this.base = base;
	}
	
	@Given("^User enter the url in the browser$")
	public void User_enter_the_url_in_the_browser() throws Throwable {

		base.Driver.navigate().to("http://​automationpractice.com");
		base.Driver.navigate().refresh();
	}
	
	@Given("^user login to the website$")
	public void user_login_to_the_website() throws Throwable {
		
		Login_Page lpage = new Login_Page(base.Driver);
		lpage.emailPwd();
		lpage.submit();
		
	}

	@When("^user selects the dresses tab$")
	public void user_selects_the_dresses_tab() throws Throwable {

		Dresses_Page dpage = new Dresses_Page(base.Driver);
		dpage.select_dress();
	}

	@When("^clicks on evening dresses$")
	public void clicks_on_evening_dresses() throws Throwable {
	    
		Dresses_Page dpage = new Dresses_Page(base.Driver);
		dpage.select_evening_dresses();
	}

	@When("^Add the expensive dress to the cart$")
	public void Add_the_expensive_dress_to_the_cart() throws Throwable {
	    
		Dresses_Page dpage = new Dresses_Page(base.Driver);
		dpage.add_expensive_dress();
	}

	@Then("^user logout of the website$")
	public void user_logout_of_the_website() throws Throwable {
		
		Home_Page hpage = new Home_Page(base.Driver);
		hpage.signout();
		
	}

	@Then("^user log back in the website$")
	public void user_log_back_in_the_website() throws Throwable {

		Login_Page lpage = new Login_Page(base.Driver);
		lpage.emailPwd();
		lpage.submit();
		
	}

	@Then("^the expensive dress should be in the cart$")
	public void the_expensive_dress_should_be_in_the_cart() throws Throwable {

		Dresses_Page dpage = new Dresses_Page(base.Driver);
		dpage.item_in_cart();
		
	}


}
