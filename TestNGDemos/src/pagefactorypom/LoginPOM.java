package pagefactorypom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	WebDriver driver;
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//*[@value='Log in']")
	WebElement signin;
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterem(String em)
	{
		email.sendKeys(em);
	}
	public void enterpassw(String Pwd)
	{
		password.sendKeys(Pwd);
	}
	public void clickonsignin()
	{
		signin.click();
	}

	
	

}
