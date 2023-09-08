package drop_down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect_dropdown {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the edge browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browsers
	    driver.manage().window().maximize();
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // opens the browser
	    driver.get("https://demoapp.skillrary.com/");
	    //addresss of drop down
	    
	   WebElement dropdown = driver.findElement(By.id("cars"));
	   Select s=new Select(dropdown);
	   s.selectByIndex(0);
	   Thread.sleep(2000);
	   s.selectByValue("199");
	   Thread.sleep(2000);
	 //s .selectByVisibleText(" INR 100 - INR 199 ( 16 ) ");
	  // Thread.sleep(3000);
	  
	   System.out.println(s.isMultiple());
	   List<WebElement> alloptions = s.getAllSelectedOptions();
	   for(WebElement b:alloptions)
	   {
		  System.out.println(b.getText()); 
	   }
	   s.deselectByIndex(0);
		   Thread.sleep(2000);
		   s.deselectByValue("199");
		  Thread.sleep(2000);
		 // s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		  //Thread.sleep(2000);
		  
		  driver.close();
		  
	   
	  

	 
	   
		// TODO Auto-generated method stub

	}

}
