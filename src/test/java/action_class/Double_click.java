package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click {

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
			    driver.get("https://demoapp.skillrary.com/");
			    WebElement ele=driver.findElement(By.xpath("//a[text()='COURSE']"));
			  
				Actions a=new Actions(driver);
				a.moveToElement(ele).perform();driver.findElement(By.xpath("a[text()='Selenium Training'])[1]")).click();
				WebElement plus = driver.findElement(By.id("add"));
				a.doubleClick(plus).perform();
				

	}

}
