package explanation_for_genericmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import genericLibraries.WebDriverUtilities;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static void main(String[] args) throws Throwable {
		WebDriverUtilities w=new WebDriverUtilities();
		
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the chrome browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browsers
	    driver.manage().window().maximize();
	    w.implicitwait(driver, 10);
	    //implicit wait
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // opens the browser
	    driver.get("https://www.amazon.com/");
	 
	   WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	   w.dropdown(dropdown, "Baby");

	 
	}
}
