package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String baseurl = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public String iePath = readconfig.getIEPath();
	public String firefoxPath = readconfig.getFirefoxPath();
	public String chromePath = readconfig.getChromePath();
	public static WebDriver driver;
	
	static Logger logger = Logger.getLogger(BaseClass.class);
		
	@BeforeClass
	public void launchBrowser() 
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver = new ChromeDriver();
		logger.info("Navigating to URL");
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void tearDown() 
	{
		logger.info("Closing the browser");
		driver.quit();
	}
	
}
