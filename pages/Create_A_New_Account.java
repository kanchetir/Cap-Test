package pages;

import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_A_New_Account {
	
	WebDriver driver;
	
	By user_email = By.id("email_create");
	By user_submit_email = By.id("SubmitCreate");
	By gender_female = By.id("id_gender2");
	By user_Firstname = By.id("customer_firstname");
	By user_Lastname = By.id("customer_lastname");
	By user_email_to_register = By.id("email");
	By user_password = By.id("passwd");
	By address_line1 = By.id("address1");
	By city = By.id("city");
	By state = By.id("id_state");
	By zipcode = By.id("postcode");
	By country = By.id("id_country");
	By mobile_phone = By.id("phone_mobile");
	By assign_Address = By.id("alias");
	By Register = By.id("submitAccount");
	By Registrion_successful_text = By.xpath("//*[@id=\"center_column\"]/p/");
	
	
	public Create_A_New_Account(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void createAnUser() {
		
		driver.findElement(user_email).sendKeys("testemail@hotmail.com");
		driver.findElement(user_submit_email).click();
	}
	
	public void registerUserDetails() {
		
		driver.findElement(gender_female).click();
		driver.findElement(user_Firstname).sendKeys("Manisha");
		driver.findElement(user_Lastname).sendKeys("Kappor");
		driver.findElement(user_email_to_register).clear();
		driver.findElement(user_email_to_register).sendKeys("testemail@hotmail.com");
		driver.findElement(user_password).sendKeys("TestMePlease");
		driver.findElement(address_line1).sendKeys("505, Chocolate road");
		driver.findElement(city).sendKeys("Alaska");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Alaska");
		driver.findElement(zipcode).sendKeys("22313");
		driver.findElement(mobile_phone).sendKeys("09876654321");
		driver.findElement(assign_Address).clear();
		driver.findElement(assign_Address).sendKeys("222, new home address, alaska");		
		
	}
	
	public void clickOnRegisterLink() {
		
		driver.findElement(Register).click();
	}
	
	public void RegSuccessful() {
		
		String registration = driver.findElement(Registrion_successful_text).getText();
		assertEquals(registration, "Welcome to your account. Here you can manage all of your personal information and orders.");
		
	}
}
