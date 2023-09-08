package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_size {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.chromedriver().setup();
				//opening the chrome browser
			    WebDriver driver= new ChromeDriver();
			    //maximizing the browsers
			    driver.manage().window().maximize();
			    //implicit wait
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    // opens the browser
			    driver.get("https://www.facebook.com/");
			    //fetching address of email text field
			  WebElement ele = driver.findElement(By.id("email"));
			Dimension size=ele.getSize();
			System.out.println(size.getHeight());
			System.out.println(size.getWidth());
	

	}

}
