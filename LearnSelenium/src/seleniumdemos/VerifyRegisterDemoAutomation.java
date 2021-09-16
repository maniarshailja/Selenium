package seleniumdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyRegisterDemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
		
		WebElement year=driver.findElement(By.xpath("//*[@placeholder='Year']"));
		Select yr=new Select(year);
		List<WebElement>yearcount=yr.getOptions();
		System.out.println(yearcount.size());
		
		for(int i=0; i<yearcount.size();i++)
		{
			System.out.println(yearcount.get(i).getText());
		
		}
		yr.selectByIndex(5);
		
		WebElement month=driver.findElement(By.xpath("//*[@placeholder='Month']"));
		Select months=new Select(month);
		List<WebElement>monthcount=months.getOptions();
		System.out.println(monthcount.size());
		
		for(int j=0; j<monthcount.size();j++)
		{
			System.out.println(monthcount.get(j).getText());
		
		}
		
		months.selectByVisibleText("May");
		
		WebElement day=driver.findElement(By.xpath("//*[@placeholder='Day']"));
		Select days=new Select(day);
		List<WebElement>daycount=days.getOptions();
		System.out.println(daycount.size());
		
		for(int k=0; k<daycount.size();k++)
		{
			System.out.println(daycount.get(k).getText());
		
		}
		
		
		days.selectByValue("2");
		
		

	}

}
