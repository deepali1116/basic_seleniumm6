package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_popup {

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
			    driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
			    driver.findElement(By.xpath(" //button[text()=' Add to Cart']")).click();
			    Alert al=driver.switchTo().alert();
			    System.out.println(al.getText());
			   // Thread.sleep(1000);
			    al.accept();
			    Thread.sleep(2000);
			    driver.close();
			    
			    
			    
			    
			    

		// TODO Auto-generated method stub

	}

}
