package seleniumdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alert.accept();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		alert.dismiss();
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		String alertm=driver.switchTo().alert().getText();
		System.out.println(alertm);
		alert.accept();
	}

}
