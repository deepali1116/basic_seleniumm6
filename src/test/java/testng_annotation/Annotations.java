package testng_annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	WebDriver driver;
	@BeforeMethod
	
	
	

	public void openingbrowser()
	{
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the Chrome browser
	    driver= new EdgeDriver(); 
	    //maximizing the browser
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void fbBrowser()
	{
	    
		// entering the URL
	   
	     driver.get("https://www.facebook.com/");
	     // driver.get("https://www.facebook.com/");
	      

	}
	
	@Test (priority=-1) 
	public void amazonbrowser()
	{
	    driver.get("https://www.amazon.com/");
	
	}
	@AfterMethod
	public void closing()
	{
		driver.close();
	}

}
