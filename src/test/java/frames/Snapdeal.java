package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

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
	    driver.get("https://www.snapdeal.com/");
	    //address of sign in 
	     WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
	     
	    //object of actions class
	    Actions a =new Actions(driver);
	
		a.moveToElement(signIn).perform();
		//address of register
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		//switching the control to frame
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("12345678");
		Thread.sleep(3000);
		//clicking to cancel
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		//switching control to normal webpage
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("assff");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		

		
	    
	 
	    
	    

		// TODO Auto-generated method stub

	}

}
