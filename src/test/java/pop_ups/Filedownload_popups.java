package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filedownload_popups {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the chrome browser
			    WebDriver driver= new EdgeDriver();
			    //maximizing the browsers
			    driver.manage().window().maximize();
			    //implicit wait
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    // opens the browser
			    driver.get("https://the-internet.herokuapp.com/download");
			    driver.findElement(By.xpath("//a[text()='sample.png']")).click();
			    
		// TODO Auto-generated method stub

	}

}
