package StepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.Checkout;
import PageObjects.DealPage;
import PageObjects.pageObjectManager;
import Utils.TCS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Checkoutpage {
	
	public WebDriver d;
	
	TCS tcs;
    pageObjectManager pom;
    String dealprodname;
    public Checkout co;
	
	public Checkoutpage(TCS tcs)
	{
		this.tcs=tcs;
		this.co=tcs.pom.getCheckout();
	}
	
	@Then("^User proceed to checkout and validate (.+) items in checkout page$")
	public void User_proceed_to_checkout_and_validate(String name) throws InterruptedException
	{
		
		co.Clickcart();
		System.out.println(name);
		Thread.sleep(4000);
	}
	
	@Then("check the availibility of promocode and checkout option")
		public void check_the_availibility_promocode_checkout_option()
		{
			
			Assert.assertTrue(co.verifyPromocode());
			Assert.assertTrue(co.verifyPlaceOrder());
				
		}
	
	 
	 
	

}
