package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_programs {

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
			  WebElement ele = driver.findElement(By.id("email"));
					 ele. sendKeys("Deepali");
			         Thread.sleep(4000);
			         ele.clear();
			         driver.close();
	

	}

}
