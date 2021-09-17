package learntestng;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {
	WebDriver driver;
	@Test
	public void testLogin() throws MalformedURLException
	{
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		driver=new RemoteWebDriver(new URL("http://192.168.1.121:4352/wd/hub"),dc);
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
		driver.findElement(By.xpath("//*[@class='ico-logout']")).click();
		driver.close();
	
	
	}
}
