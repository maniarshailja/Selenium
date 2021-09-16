package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("shailjam");
		driver.findElement(By.id("LastName")).sendKeys("maniar");
		driver.findElement(By.id("Email")).sendKeys("shailja3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("shailjam@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("shailjam@123");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.xpath("//*[@class='ico-logout']")).click();
		driver.close();
	}

}
