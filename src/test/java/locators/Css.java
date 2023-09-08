package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//opening the chrome browser
	    WebDriver driver= new ChromeDriver();
	    //maximizing the browser
	    driver.manage().window().maximize();
	    // opens the browser
	    driver.get("https://www.facebook.com/");
	    //fetching 
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hi");

	}

}
