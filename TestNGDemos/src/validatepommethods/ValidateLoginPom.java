package validatepommethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompackage.LoginPagePom;

public class ValidateLoginPom {
	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPagePom login=new LoginPagePom(driver);
		login.enteremail("rekhabr1@gmail.com");
		login.enterpassword("rekhab");
		login.clicksignin();
		driver.close();
	}

}
