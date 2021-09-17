package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BackgroundDemo {
	WebDriver driver;
	@Given("^I am on homepage$")
	public void i_am_on_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
	    
	}

	@Then("^I should see that title contains \"([^\"]*)\"$")
	public void i_should_see_that_title_contains(String arg1) throws Throwable {
	    assert driver.getTitle().contains("Shop");
	}

	@Then("^I should see that source contains \"([^\"]*)\"$")
	public void i_should_see_that_source_contains(String arg1) throws Throwable {
		assert driver.getTitle().contains("Shop");
		driver.close();
	}



}
