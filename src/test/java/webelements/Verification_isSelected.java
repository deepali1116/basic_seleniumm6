package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_isSelected {

	public static void main(String[] args) {
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//opening the edge browser
	    WebDriver driver= new ChromeDriver();
	    //maximizing the browsers
	    driver.manage().window().maximize();
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // opens the browser
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//a[@id='u_0_0_C/']")).click();
	    //address of radio button
	    WebElement  radio=driver.findElement(By.xpath("//a[text()='Create new account']"));
	    if(radio.isSelected())
	    {
	    	System.out.println("got selected");
	    	radio.click();
	    }
	    else
	    {
	    	System.out.println( " not selected");
	    }
	    
	   
		// TODO Auto-generated method stub

	}

}
