package stepDefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin 
{
	WebDriver driver;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	   
	   
	}

	@When("^user enters valid data$")
	public void user_enters_valid_data() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
	   
	}

	@Then("^user should see logout link$")
	public void user_should_see_logout_link() throws Throwable {
		boolean view=driver.findElement(By.xpath("//*[@class='ico-logout']")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.xpath("//*[@class='ico-logout']")).click();
		driver.close();
	    
	}


}
