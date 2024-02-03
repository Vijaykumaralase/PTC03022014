package StepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.DealPage;
import PageObjects.pageObjectManager;
import Utils.TCS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DealPageSearch {
	
	public WebDriver d;
	public String Searchresults;
	TCS tcs;
    pageObjectManager pom;
    String dealprodname;
	
	public DealPageSearch(TCS tcs)
	{
		this.tcs=tcs;
	}
	
	@Then("^I search usting short name (.+) and should be able to mach both results$")
	public void i_search_usting_short_name_and_should_be_able_to_mach_both_results(String string) throws InterruptedException {
		
		swichwindow();
        //pom = new pageObjectManager(tcs.d);
		DealPage DP=tcs.pom.getDealsPage();
		//DealPage DP = new DealPage(tcs.d);
		DP.search(string);
		Thread.sleep(4000);
		String dealprodname=DP.GetProductName();
		System.out.println(dealprodname);
		Assert.assertEquals(tcs.Searchresults, dealprodname);
	}
	
	public void  swichwindow()
	{
		tcs.GM.SwitchWindow1();
		//Set<String> windows=tcs.d.getWindowHandles();
		//Iterator<String> it=windows.iterator();
		//String Parent = it.next();
		//String Child = it.next();
		//tcs.d.switchTo().window(Child);
	}

}
