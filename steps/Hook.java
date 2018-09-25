package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hook {
	
	 private BaseUtil base;

	    public Hook(BaseUtil base) {
	        this.base = base;
	    }
	    
	   // @Before
	     public Hook() {

	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrn93708n\\Downloads\\chromedriver.exe");
			 ChromeOptions options = new ChromeOptions();
			 options.setAcceptInsecureCerts(true);
			 options.addArguments("--start-maximized");
			 options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
			 base.Driver = new ChromeDriver(options);
				        
	    }
	    
	    @After
	    public void TearDownTest(Scenario scenario) {
	        if (scenario.isFailed()) {
	        	
	        	base.Driver.close();
	        }
	        System.out.println("Closing the browser : MOCK" + scenario.toString());
	    }

}
