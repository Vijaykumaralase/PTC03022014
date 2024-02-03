package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealPage {
	
	public WebDriver d ;
	public DealPage(WebDriver d)
	{
		this.d=d;
	}
	
	By search = By.cssSelector("input[id='search-field']");
	By dealproduct = By.xpath("//tr/td [1]");

	
	public void search(String name)
	{
		d.findElement(search).sendKeys(name);
	}
	
	public String GetProductName()
	{
		return d.findElement(dealproduct).getText();
	}
	
	

}
