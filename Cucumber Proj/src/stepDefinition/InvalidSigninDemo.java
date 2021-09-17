package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidSigninDemo {
	WebDriver driver;
	@Given("^User is present$")
	public void user_is_present() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	    
	}

	@When("^user enters invalid entries$")
	public void user_enters_invalid_entries() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhaa");
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
	}

	@Then("^user should see the error \"([^\"]*)\"$")
	public void user_should_see_the_error(String arg1) throws Throwable {
		String message=driver.findElement(By.xpath("//*[contains(text(),'Login was unsuccessful.')]")).getText();
		Assert.assertEquals("Invalid Credetials",message);
		driver.close();
	}

}
