import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class wddemoIE {

	public static void main(String[] args) {
/*
		 // Method and Description - static DesiredCapabilities internetExplorer()
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 
		 //Method and Description - void setCapability(java.lang.String capabilityName, boolean value)
		 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
*/
		  System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriverServer.exe");	
	      WebDriver driver = new InternetExplorerDriver();

          // Load sample calc test URL.
	      driver.get("http://only-testing-blog.blogspot.com/2014/04/calc.html");

	      // Execute sample calc test.
	      driver.findElement(By.xpath("//input[@id='1']")).click();
	           
	      driver.findElement(By.xpath("//input[@id='plus']")).click();
	   
	      driver.findElement(By.xpath("//input[@id='6']")).click();
	      driver.findElement(By.xpath("//input[@id='equals']")).click();
	      String result = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
	      System.out.println("Calc test result Is : " + result);
	      driver.close();

	     
	}

}
