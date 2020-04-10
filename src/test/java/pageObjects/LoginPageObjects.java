package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	WebDriver driver;
	
	public LoginPageObjects(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;

	@FindBy(name="password")
	public static WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	public static WebElement btnLogin;
	
	
	public void setUserName(String uname) 
	{
		txtUserName.clear();
		txtUserName.sendKeys(uname);
	}
		
	public void setPassword(String pwd) 
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() 
	{
		btnLogin.click();
	}
}
