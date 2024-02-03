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
import PageObjects.LandingPage;
import PageObjects.pageObjectManager;
import Utils.TCS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LandingPageSearch {
	
	public WebDriver d;
	public String Searchresults;
	public TCS tcs;
	public LandingPage LP;
	public pageObjectManager pom ;
	public Checkout co;
	
	public LandingPageSearch(TCS tcs)
	{
		this.tcs=tcs;
	}
	
	@Given("I Initiate the browser and Hit the URL")
	public void i_initiate_the_browser_and_hit_the_url() {
	   
		//ChromeOptions CO = new ChromeOptions();
		//CO.addArguments("--remote-allow-origins=*");
	    //tcs.d = new ChromeDriver(CO);
	   // tcs.d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("^I type the short name (.+) and get the Product name which appears as results$")
	public void i_type_the_short_name_and_get_the_product_name_which_appears_as_results(String Product) throws InterruptedException {
		
		//pom = new pageObjectManager(tcs.d);
		LP=tcs.pom.getlandingpage();
		
		//LP = new LandingPage(tcs.d);
		LP.search(Product);
		//tcs.d.findElement(By.cssSelector("input.search-keyword")).sendKeys(Product);
		Thread.sleep(4000);
		tcs.Searchresults=LP.GetProductName().split("-")[0].trim();
		System.out.println(tcs.Searchresults);  
	}

	@When("Click on top deal link")
	public void click_on_top_deal_link() throws InterruptedException {
		LP.clickTopDeal();
		Thread.sleep(4000);
	    
	}
	
	@When("i increase the Quantity")
	 public void i_increase_the_Quantity() throws InterruptedException
	 {
		LP.IncreaseCount();
		LP.AddToCart();
		
	 }
	@When("I check for the logo")
	public void I_check_for_the_logo()
	{
		System.out.println("got the logo");
	}
	
	@Then("i should be able match the logo")
	public void i_should_be_able_match_the_logo()
	{
		LP.getlogo();
	}

	

}
