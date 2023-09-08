package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_name_link_partial_linktext {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//opening the chrome browser
	    WebDriver driver= new ChromeDriver();
	    //maximizing the browser
	    driver.manage().window().maximize();
	    // opens the browser
	    driver.get("https://www.facebook.com/");
	    //fetching address of email text field
	    driver.findElement(By.id("email")).sendKeys("Deepali");
	    //fetching address of password field
	    driver.findElement(By.name("pass")).sendKeys("Deepali123");
	    Thread.sleep(4000);
	    //address of link using linktext
	    driver.findElement(By.linkText("Forgotten password?")).click();
	   Thread.sleep(4000);
	 
	 //address of link using partiallinktext
	   // driver.findElement(By.partialLinkText("Forgotten ")).click();
	   driver.quit();
	   
	    
	    
	}

}
