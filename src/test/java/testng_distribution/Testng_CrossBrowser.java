package testng_distribution;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_CrossBrowser {
	@Parameters({"browsername"})
	
	@Test
	public void crossBrowser( String browser) throws Throwable
	{
		WebDriver driver;
		
		if(browser.equals("edge"))
		{
			//driver related statement
			WebDriverManager.edgedriver().setup();
			//opening the edge browser
		     driver= new EdgeDriver();
		}
		else
		{
			//driver related statement
			WebDriverManager.chromedriver().setup();
			//opening the edge browser
		     driver= new ChromeDriver();
		}
		
	    //maximizing the browsers
	    driver.manage().window().maximize();
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // opens the browser
	    driver.get("https://www.amazon.com/");
	    Thread.sleep(2000);
	    driver.close();
	    
	}

}
