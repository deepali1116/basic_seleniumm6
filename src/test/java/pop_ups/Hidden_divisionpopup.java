package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_divisionpopup {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the chrome browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browsers
	    driver.manage().window().maximize();
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    // opens the browser
	    driver.get("https://www.redbus.in/");
	    driver.findElement(By.xpath("//span[text()='Date']")).click();
	    //address of date
	     WebElement date = driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='26']"));
	     //Thread.sleep(2000);
	     
	     System.out.println(date.getText());
	     driver.close();
	     
		// TODO Auto-generated method stub

	}

}
