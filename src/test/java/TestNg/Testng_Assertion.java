package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Assertion {
	@Test
	public void assertion()
	{
		//driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the edge browser
			    WebDriver driver= new EdgeDriver();
			    //maximizing the browser
			    driver.manage().window().maximize();
			    //implicit wait
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    driver.get("https://www.amazon.com/");
			    String title=driver.getTitle();
			    //using hard assert
			  // Assert.assertEquals(title," asgfyt");
			    //using soft assert
			    SoftAssert s=new SoftAssert();
			    s.assertEquals(title, " asdg");
			  
			    System.out.println(driver.getCurrentUrl());
			    
	}

}
