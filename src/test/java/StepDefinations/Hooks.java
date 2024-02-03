package StepDefinations;

import java.io.IOException;

import Utils.TCS;
import io.cucumber.java.After;

public class Hooks {
	
	TCS tcs;
	
	public Hooks(TCS tcs) 
	{
		this.tcs=tcs;
	}
	
	@After
	public void closeBrowser() throws IOException
	{
		tcs.tb.WebDriverManager().quit();
	}

}
