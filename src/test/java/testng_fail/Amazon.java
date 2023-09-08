package testng_fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	public void amazon1()
	{
		WebDriverManager.edgedriver().setup();
		//opening the edge browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browser
	    driver.manage().window().maximize();
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.amazon.com/");
	}

}
