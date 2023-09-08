package testng_distribution;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Testng {
@Test
public void amazon() throws InterruptedException
{
	//driver related statement
	WebDriverManager.edgedriver().setup();
	//opening the edge browser
    WebDriver driver= new EdgeDriver();
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

