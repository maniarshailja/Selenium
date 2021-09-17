package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineDemo {
	WebDriver driver;
	@Given("^User is present on demowebshop login page$")
	public void user_is_present_on_demowebshop_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^user enters ([^\\\"]*) and ([^\\\"]*)$")
    public void user_enters_email_and_password(String email,String password) throws Throwable {
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.name("Password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@value='Log in']")).click();
	}
	@Then("^user should see the logout link$")
	public void user_should_see_the_logout_link() throws Throwable {
		boolean view=driver.findElement(By.xpath("//*[@class='ico-logout']")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.xpath("//*[@class='ico-logout']")).click();
		driver.close();
	}

	


}
