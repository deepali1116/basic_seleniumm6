package testng_annotation;
 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation2 {
	WebDriver driver;
	@BeforeMethod
	
	public void openingbrowser()
	{
		WebDriverManager.edgedriver().setup();
	 driver= new EdgeDriver(); 
	    //maximizing the browser
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(invocationCount=2)
	public void geturl()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("deepali");
		driver.findElement(By.name("pass")).sendKeys("deepu");
		driver.findElement(By.name("login")).click();	
}
	@AfterMethod
	public void closeing()
	{
		driver.close();
	}
	@Test(priority=2)
	public void getamazonurl()
	{
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("xgqwiyd");
		
	}
	}
	

