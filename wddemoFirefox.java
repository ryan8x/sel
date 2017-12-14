import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wddemoFirefox {


	  	@Test
		public void getArtistTest(){
	  		
			  System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");	
		      WebDriver driver = new FirefoxDriver();

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

			Assert.assertEquals("7", result); 
	      
	}

}
