import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class wddemoChrome {

	public static void main(String[] args) {

		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");	
	      WebDriver driver = new ChromeDriver();

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
