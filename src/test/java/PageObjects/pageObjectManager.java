package PageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	
	public LandingPage LP;
	public WebDriver d;
	public DealPage DP;
	public Checkout co;
	
	public pageObjectManager(WebDriver d)
	{
		this.d=d;
		
	}
	
	public LandingPage getlandingpage()
	{
		LP = new LandingPage(d);
		return LP;
	}
	
	public DealPage getDealsPage()
	{
		DP = new DealPage(d);
		return DP;
	}
	
	public Checkout getCheckout()
	{
		co = new Checkout(d);
		return co;
	}

}
