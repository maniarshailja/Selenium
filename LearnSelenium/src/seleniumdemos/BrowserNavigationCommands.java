package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("Title length: "+title.length());
		
		String pgs=driver.getPageSource();
		System.out.println("Pagesource length: "+pgs.length());
		
		
		String url=driver.getCurrentUrl();
		String expectedurl="http://demowebshop.tricentis.com/";
		System.out.println(url);
		
		if(expectedurl.equals(url))
		{
			
				System.out.println("You are on correct page");
		
				driver.findElement(By.xpath("//*[@href='/register']")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().forward();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3000);
				driver.close();
		}
		else 
		{
			System.out.println("you are on wrong page");
			driver.close();
	}

}
}
