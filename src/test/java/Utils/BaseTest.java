package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	WebDriver d;

	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//Resorcess//MasterData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String Browser_property = prop.getProperty("Browser");
		System.out.println(Browser_property);
		String Browser_maven = System.getProperty("Browser");
		
		String browser = Browser_maven!=null ? Browser_maven : Browser_property;
		String URL = prop.getProperty("Url");
		System.out.println(URL);
		String name = prop.getProperty("Name");
		System.out.println(name);
			
		if(d==null)
		{
			//if (browser.equalsIgnoreCase("Chrome"))
			//{
		         ChromeOptions CO = new ChromeOptions();
		         CO.addArguments("--remote-allow-origins=*");
	             d = new ChromeDriver(CO);
	             d.get(URL);
		  // }
			
			/*if(browser.equalsIgnoreCase("Firefox"))
				
			{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//test//Resorcess//FirefoxDriver//geckodriver.exe");
				d = new FirefoxDriver();
				
				d.get("URL");
				
			}*/
		
			
	}return d;
		
		
		
	}
}

