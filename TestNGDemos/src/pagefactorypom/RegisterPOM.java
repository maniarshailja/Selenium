package pagefactorypom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	WebDriver driver;
	@FindBy(id="gender-female")
	WebElement gender;
	
	@FindBy(id="gender-male")
	WebElement genderm;
	
	
	@FindBy(name="FirstName")
	WebElement fn;
	@FindBy(name="LastName")
	WebElement ln;
	
	@FindBy(name="Email")
	WebElement emails;
	
	@FindBy(name="Password")
	WebElement passw;
	
	@FindBy(name="ConfirmPassword")
	WebElement conpass;
	
	
	@FindBy(name="register-button")
	WebElement register;
	
	public RegisterPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void entergender()
	{
		gender.click();
	}
	
	public void entergenderm()
	{
		genderm.click();
	}
	public void enterfn(String fname)
	{
		fn.sendKeys(fname);
	}
	public void enterln(String lname)
	{
		ln.sendKeys(lname);
	}
	public void enem(String em)
	{
		emails.sendKeys(em);
	}
	public void enpass(String ps)
	{
		passw.sendKeys(ps);
	}
	public void enterconpass(String cp)
	{
		conpass.sendKeys(cp);
	}
	public void clickonregister()
	{
		register.click();
	}
	
	
	

}
