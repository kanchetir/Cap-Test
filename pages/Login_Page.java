package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_Page {
	
	WebDriver driver;
	
	By email = By.id("email");
	By passwd = By.id("passwd");
	By Signin = By.id("SubmitLogin");
	
	
	public Login_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void emailPwd() {
		
		driver.findElement(email).sendKeys("testemail@hotmail.com");
		driver.findElement(passwd).sendKeys("TestMePlease");
	}
	
	public void submit() {
		

		driver.findElement(Signin).click();
	}

	
}
