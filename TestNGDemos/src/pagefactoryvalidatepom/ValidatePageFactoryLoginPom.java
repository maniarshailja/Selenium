package pagefactoryvalidatepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactorypom.LoginPOM;


public class ValidatePageFactoryLoginPom {
	@Test
	public void validatelogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPOM loginpage=PageFactory.initElements(driver, LoginPOM.class);
		loginpage.enterem("s1s1@gmail.com");
		loginpage.enterpassw("s1s1s1");
		loginpage.clickonsignin();
		driver.close();
	}


}
