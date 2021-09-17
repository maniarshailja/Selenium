package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDemo {
	WebDriver driver;
	@Test(description="Testcase to verify application is opening")
	public void startapp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("start application");
	}
	@Test(dependsOnMethods="startapp",description="Testcase to verify login functionality")
	public void loginapp()
	{
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
		System.out.println("successfully login");
	}
	@Test(dependsOnMethods="loginapp")
	public void signoff()
	{
		driver.findElement(By.xpath("//*[@class='ico-logout']")).click();

		System.out.println("successfully signoff");
	}
	
	@Test(dependsOnMethods="signoff",alwaysRun=true)
	public void closebrowser()
	{
		
		driver.close();

	}

}
