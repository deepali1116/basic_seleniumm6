package pop_ups;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload_using_robotclass {

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
			    driver.get("https://www.foundit.in/");
			    driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
			   WebElement button = driver.findElement(By.id("file-upload"));
			   JavascriptExecutor js=( JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();",button);
			 
			   
			   // Thread.sleep(2000);
			    Robot r=new Robot();
			    StringSelection str=new StringSelection("C:\\Users\\Deepali\\Desktop\\DEEPLALI RESUME");
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			    Thread.sleep(2000);
			    r.keyPress(KeyEvent.VK_CONTROL);
			    r.keyPress(KeyEvent.VK_V);
			    Thread.sleep(2000);
			    r.keyRelease(KeyEvent.VK_CONTROL);
			    r.keyRelease(KeyEvent.VK_V);
			    Thread.sleep(2000);
			    r.keyPress(KeyEvent.VK_ENTER);
			    r.keyRelease(KeyEvent.VK_ENTER);
			    
			    	    
			    
			    
			    
	

	}

}
