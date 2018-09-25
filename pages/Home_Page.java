package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
	
	WebDriver driver;
	
	By signin = By.xpath("//*[@id=\\\"header\\\"]/div[2]/div/div/nav/div[1]/a");
	By signout = By.linkText("Sign out");
	
	
	public Home_Page(WebDriver driver)
	{
		this.driver = driver;
	}

	public void signin() {
		
		driver.findElement(signin).click();
	}
	
	public void signout() {
		
		driver.findElement(signout).click();
	}
}
