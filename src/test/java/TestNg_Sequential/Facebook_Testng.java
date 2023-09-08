package TestNg_Sequential;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Testng {
	@Test 
	public void facebook()
	{
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the Chrome browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browser
	    driver.manage().window().maximize();
	    // entering the URL
	    driver.get("https://www.facebook.com/");
	}

}
