package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {


	static Properties pro;

	public ReadConfig() 
	{
		String File = "./Configuration/config.properties";
		try {
			FileInputStream file = new FileInputStream(File);
			pro = new Properties();
			pro.load(file);	
		}
		catch(Exception e){
			System.out.println("Exception is: "+e.getMessage());
		}
	}

	public String getApplicationURL() 
	{
		String baseurl = pro.getProperty("baseURL");
		return baseurl;
	}

	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}

	public String getFirefoxPath() {
		String firefoxPath = pro.getProperty("firefoxpath");
		return firefoxPath;
	}	
	
	public String getIEPath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}
	

}
