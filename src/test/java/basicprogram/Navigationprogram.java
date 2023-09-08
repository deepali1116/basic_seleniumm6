package basicprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationprogram {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    driver.navigate().to("https://www.amazon.com/");
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	    
	

	}

}
