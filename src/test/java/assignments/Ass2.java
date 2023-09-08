package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass2 {
	public static void main()
	{

	WebDriverManager.edgedriver().setup();
    WebDriver driver= new EdgeDriver();
    driver.manage().window().maximize();
    // opens the browser
    driver.get("");
	}
}
