package seleniumdemos;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(Log4jDemo.class);
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		log.info("launch browser");
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		log.info("opened browser");
		
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		log.info("Title value is: "+actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		{
				System.out.println("You are on correct page");
				driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("rekhab");
				driver.findElement(By.xpath("//*[@value='Log in']")).click();
				driver.findElement(By.xpath("//*[@class='ico-logout']")).click();
				driver.close();
		}
		else
		{
			System.out.println("You are on wrong page");
			log.error("expected title is: "+expectedtitle);
			driver.close();
		}
		

	}

}
