package pagefactoryvalidatepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pagefactorypom.RegisterPOM;

public class ValidatePageFactoryRegister {
	@Test
	public void validateRegister()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		RegisterPOM registerpage=PageFactory.initElements(driver, RegisterPOM.class);
		registerpage.entergender();
		registerpage.enterfn("s");
		registerpage.enterln("s");
		registerpage.enem("s1s1@gmail.com");
		registerpage.enpass("s1s1s1");
		registerpage.enterconpass("s1s1s1");
		registerpage.clickonregister();
	}

}
