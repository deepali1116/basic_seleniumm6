package TestNg_Sequential;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Testng {
@Test
public void amazon()
{
	//driver related statement
	WebDriverManager.edgedriver().setup();
	//opening the chrome browser
    WebDriver driver= new EdgeDriver();
    //maximizing the browsers
    driver.manage().window().maximize();
    //implicit wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // opens the browser
    driver.get("https://www.amazon.com/");

}
}

