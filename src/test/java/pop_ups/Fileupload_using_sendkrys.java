package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload_using_sendkrys {

	public static void main(String[] args) {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the chrome browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browsers
	    driver.manage().window().maximize();
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    // opens the browser
	    driver.get("https://www.foundit.in/");
	    driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
	    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Deepali\\Desktop/DEEPLALI RESUME.pdf");
	    
	    
	   

		// TODO Auto-generated method stub

	}

}
