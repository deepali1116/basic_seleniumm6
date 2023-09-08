package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//print all the link available in  webpage  in the console

public class Tag_name {

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
			  List<WebElement>allLinks= driver.findElements(By.tagName("a"));
			  for(WebElement b:allLinks)
				  
			  {
				  System.out.println(b.getText());
			  }
			  driver.close();
	}

}
