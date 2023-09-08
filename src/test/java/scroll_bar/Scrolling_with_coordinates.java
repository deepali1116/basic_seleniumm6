package scroll_bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_with_coordinates {

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
	    driver.get("https://www.amazon.com/");
	    //address of career
	   WebElement car = driver.findElement(By.xpath("//a[text()='Careers']"));
	   Point coordinates = car.getLocation();
	   int x=coordinates.getX();
	   int y=coordinates.getY(); 
	    //downcasting
	   JavascriptExecutor js=( JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(" +x+","+y+")");
	   Thread .sleep(2000);
	   //another method to click
	   //js.executeScript("arguments[0].click();",car);
	   
	   car.click();
	   Thread .sleep(2000);
	   driver.close();
	   
		// TODO Auto-generated method stub

	}

}
