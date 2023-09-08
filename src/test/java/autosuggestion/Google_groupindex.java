package autosuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_groupindex {

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
			
			WebElement thirdelement = driver.findElement(By.xpath("(//li[@data-view-type='1'])[3]"));
			System.out.println(thirdelement.getText());
			driver.close();

		// TODO Auto-generated method stub

	}

}
