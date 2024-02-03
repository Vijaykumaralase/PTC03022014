package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.pageObjectManager;

public class TCS {
	
	public WebDriver d;
	public String Searchresults;
	public pageObjectManager pom;
	public BaseTest tb;
	public GenericMethods GM;
	
	public TCS() throws IOException
	{
		tb = new BaseTest();
		pom = new pageObjectManager(tb.WebDriverManager());
		GM = new GenericMethods(tb.WebDriverManager());
	}

}
