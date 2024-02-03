package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver d ;
	
	public LandingPage(WebDriver d)
	{
		this.d=d;
	}
	
	By search = By.cssSelector("input.search-keyword");
	By product = By.cssSelector("h4.product-name");
	By topdeal = By.linkText("Top Deals");
	By increase = By.cssSelector("a.increment");
	By checkout = By.xpath("//button[text()='ADD TO CART']");
	By logo = By.cssSelector("div.brand.greenLogo");
	
	
	
	public void search(String name)
	{
		d.findElement(By.cssSelector("input.search-keyword")).sendKeys(name);
	}
	
	public String GetProductName()
	{
		return d.findElement(product).getText();
	}
	
	public void clickTopDeal()
	{
		d.findElement(By.linkText("Top Deals")).click();
	}
	
	public void IncreaseCount()
	{
		d.findElement(By.cssSelector("a.increment")).click();
	}
	
	public void AddToCart() throws InterruptedException
	{
		d.findElement(checkout).click();
		Thread.sleep(4000);
	}
	
	public String getlogo()
	{
		return d.findElement(logo).getText();
		
	}

}
