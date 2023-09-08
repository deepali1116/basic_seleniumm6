package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		//driver related statement
				WebDriverManager.chromedriver().setup();
				//opening the Chrome browser
			    WebDriver driver= new ChromeDriver();
			    //maximizing the browser
			    driver.manage().window().maximize();
			    // entering the URL
			    driver.get("https://www.facebook.com/");
			    //address of email  text_field using x_path attribute
			    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hi");
			    //address of password field using x path contains attribute
			    driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("hello");
			    Thread.sleep(4000);
			    
			    //address of create page by x_path text
			    driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
			    driver.close();
			    
	}

}
