package pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Childbrowser_popup {

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
	    driver.get("https://www.skillrary.com/");
	    String parent=driver.getWindowHandle();
	    
	    driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
	    
	    WebElement button = driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[1]"));
	    JavascriptExecutor js=( JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",button);
	    Thread.sleep(2000);
	    
	    //shifting control to child browser
	    Set<String> child = driver.getWindowHandles();
	    for(String b:child)
	    {
	    	driver.switchTo().window(b);
	    	
	    }
	    driver.findElement(By.xpath("//input[@placeholder='Enter name to continue']")).sendKeys("deepali");
	    Thread.sleep(2000);
	    //shifting control parenet windoe
	    driver.switchTo().window(parent);
	    driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();

	  
	    
	    
	    
	    
	    
	    
	    
	    
		// TODO Auto-generated method stub

	}

}
