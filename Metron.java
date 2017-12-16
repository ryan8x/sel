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
//import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Metron {

	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.metsci.com/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testADAPage(){

		driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/ul/li[1]/a")).click();

		String result = driver.findElement(By.xpath("//*[@id=\"dnn_ctr828_TITLE1_titleLabel\"]")).getText();
		System.out.println("test result Is : " + result);


		Assert.assertEquals("Advanced Data Analytics", result);

	}
	
	@Test
	public void testAMAPage(){

		driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/ul/li[2]/a")).click();

		String result = driver.findElement(By.xpath("//*[@id=\"dnn_ctr429_TITLE1_titleLabel\"]")).getText();
		System.out.println("test result Is : " + result);


		Assert.assertEquals("Advanced Mathematics Applications", result);

	}
	
	//@Ignore
	@Test
	public void testORCAPage(){

		driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/ul/li[5]/a")).click();

		String result = driver.findElement(By.xpath("//*[@id=\"dnn_ctr432_TITLE1_titleLabel\"]")).getText();
		System.out.println("test result Is : " + result);
		
		//driver.close();

		Assert.assertEquals("ORCA", result);

	}

}
