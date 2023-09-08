package assignments;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1 {

	public static void main(String[] args) throws Throwable {
		//creating object for property class
	Properties p=new Properties();
   //creating an object for FileInputStream
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data_for_instagram.properties");
    p.load(fis);
	String appurl=p.getProperty("url");
    String User=p.getProperty("username");
    String Password=p.getProperty("password");
		WebDriverManager.edgedriver().setup();
	    WebDriver driver= new EdgeDriver();
	    driver.manage().window().maximize();
	    // opens the browser
	    driver.get(appurl);
	    // get the title of webpage
	    //address of username
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(User);
	    //address of password field
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
	    //address of login button
	    driver.findElement(By.xpath("//button[@type='submit']")).submit()
;
	    System.out.println(driver.getTitle());
	    //printing the current url
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(4000);
	    driver.close();
	    
		
		// TODO Auto-generated method stub

	}

}
