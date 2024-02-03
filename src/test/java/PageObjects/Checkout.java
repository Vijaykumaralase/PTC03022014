package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	
	public WebDriver d ;
	public Checkout(WebDriver d)
	{
		this.d=d;
	}
	
	By CartButton = By.cssSelector("img[alt='Cart']");
	By Checkoutbutton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
    By promofield = By.cssSelector("input.promoCode");
    By placeOrder = By.xpath("//button[text()='Place Order']");
	
    public void Clickcart()
	{
    	System.out.println("I am in Clickcart method");
		d.findElement(CartButton).click();
		d.findElement(Checkoutbutton).click();
	}
	
	public boolean verifyPromocode()
	{
		return d.findElement(promofield).isDisplayed();
		
	}
	
	public boolean verifyPlaceOrder()
	{
		
		return d.findElement(placeOrder).isDisplayed();
	}
	
	
	

}
