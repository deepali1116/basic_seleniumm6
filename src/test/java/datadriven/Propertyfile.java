package datadriven;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;


public class Propertyfile {

	public static void main(String[] args) throws Throwable {
		//creating object for property class
		Properties p=new Properties();
		//creating an object for FileInputStream
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String appurl=p.getProperty("url");
		String User=p.getProperty("username");
		String Password=p.getProperty("password");
		
		
		WebDriverManager.edgedriver().setup();
		//opening the edge browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browser
	    driver.manage().window().maximize();
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // entering the URL
	    driver.get(appurl);
	  //address of email  text_field using x_path attribute
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(User);
	    //address of password field using x path contains attribute
	    driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys(Password);
	   // Thread.sleep(4000);
		
		
		
		
		
	

	}

}
