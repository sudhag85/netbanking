package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class TC_Login_001 extends BaseClass {
	static Logger logger = Logger.getLogger(BaseClass.class);

	@Test
	public void login()
	{
		logger.info("Creating object for LoginPageObjects class");
		LoginPageObjects lp = new LoginPageObjects(driver);
	//	PageFactory.initElements(driver, LoginPageObjects.class);
		logger.info("Entering username");
		lp.setUserName(username);
		logger.info("Entering Password");
		lp.setPassword(password);
		logger.info("Clicking Login");
		lp.clickLogin();
	}
}
