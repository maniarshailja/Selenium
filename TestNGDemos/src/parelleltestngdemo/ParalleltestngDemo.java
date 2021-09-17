package parelleltestngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParalleltestngDemo
{
	WebDriver driver;
	@Test
	public void setbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("start application");
		String title1=driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals(title1,"Demo Web Shop. Login");
		
		driver.quit();
	}
	@Test
    public void startapp() throws Exception
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"google");
		driver.quit();
    }
	
}
