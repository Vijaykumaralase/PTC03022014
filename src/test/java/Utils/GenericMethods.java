package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericMethods {
	
	public WebDriver d;
	
	 public GenericMethods(WebDriver d)
	 {
		 this.d=d;
	 }
	public void SwitchWindow1()
	{
		Set<String> windows=d.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String Parent = it.next();
		String Child = it.next();
		d.switchTo().window(Child);
	
	}

}
