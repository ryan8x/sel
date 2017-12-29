import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Careers {

	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.metsci.com/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Ignore
	@Test
	public void testSearchNoMatch(){
		
		driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[1]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[3]/div[1]/div[1]/div/ul/div[3]/ul/li/a")).click();
		
		//need delay
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"icims_content_iframe\"]"));
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='icims_content_iframe']"));
		WebElement frameElement = driver.findElement(By.id("icims_content_iframe"));
		//WebElement frameElement = driver.findElement(By.name("icims_content_iframe"));
				
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("jsb_f_keywords_i")).click();
		driver.findElement(By.id("jsb_f_keywords_i")).sendKeys("1234567890abcdefg");
		driver.findElement(By.xpath("//*[@id=\"jsb_form_submit_i\"]")).click();

		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/a")).click();

		String result = driver.findElement(By.xpath("/html/body/div[2]/div[2]")).getText();
		System.out.println("test result Is : " + result);


		Assert.assertEquals("Sorry, no jobs were found that match your search criteria. Please try other selections.", result);

	}

	@Test
	public void testGetAll(){
		driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[1]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[3]/div[1]/div[1]/div/ul/div[3]/ul/li/a")).click();
		
		//need delay
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement frameElement = driver.findElement(By.id("icims_content_iframe"));
				
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/a")).click();

		String result = driver.findElement(By.xpath("/html/body/div[2]/div[2]")).getText();
		System.out.println("test result Is : " + result);


		Assert.assertEquals("Here are our current job openings. Please click on the job title for more information, and apply from that page if you are interested.", result);

	}
	
}