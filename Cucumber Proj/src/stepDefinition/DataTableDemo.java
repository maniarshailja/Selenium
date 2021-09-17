package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableDemo {
	WebDriver driver;
	@Given("^User is on demowebshop login page$")
	public void user_is_on_demowebshop_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	   
	}

	@When("^user signs in with login button$")
	public void user_signs_in_with_login_button(DataTable credentials) throws Throwable {
		List<List<String>> data=credentials.raw();
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
	}

	@Then("^user should view logout$")
	public void user_should_view_logout() throws Throwable {
		boolean view=driver.findElement(By.xpath("//*[@class='ico-logout']")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.xpath("//*[@class='ico-logout']")).click();
		driver.close();
	    
	    
	}

}
