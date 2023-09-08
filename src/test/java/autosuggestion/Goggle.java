package autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goggle {

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
	    driver.get("https://www.google.com/");
	    // address of search text field
	driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
	Thread.sleep(3000);
	//address of list
	
	List<WebElement> allList = driver.findElements(By.xpath("//li[@data-view-type='1']"));
	for(WebElement list:allList)
	{
		System.out.println(list);
	}
	driver.close();

	

	}

}
