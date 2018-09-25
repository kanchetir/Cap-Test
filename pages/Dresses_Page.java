package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dresses_Page {
	
	WebDriver driver;
	
	By dresses_tab = By.linkText("DRESSES");
	By evening_dresses = By.linkText("Evening Dresses");
	By sort_price = By.id("selectProductSort");
	By add_to_cart = By.linkText("Add to cart");
	By proceed_to_checkout = By.linkText("Proceed to checkout");
	By cart = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
	
	public Dresses_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void select_dress() {
		
		driver.findElement(dresses_tab).click();
	}

	public void select_evening_dresses() {
		
		driver.findElement(evening_dresses).click();
	}
	
	public void add_expensive_dress() {
		
		Select sortPrice = new Select(driver.findElement(sort_price));
		sortPrice.selectByVisibleText("Price: Highest first");
		driver.findElement(add_to_cart).click();
		driver.findElement(proceed_to_checkout).click();
	}
	
	public void item_in_cart() {
		
		driver.findElement(cart).click();
	}
	
	
}
