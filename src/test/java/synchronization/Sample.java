package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//opening the Chrome browser
	    WebDriver driver= new ChromeDriver();
	    //maximizing the browser
	    driver.manage().window().maximize();
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //explicit way
	    WebDriverWait wait=new WebDriverWait(driver,10);
	    driver.get(null);
	    WebElement ele=driver.findElement(By.id("email"));
	    //using explicit wait
	    wait.until(ExpectedConditions.visibilityOf(ele));
	    
	    
	    

	}

}
