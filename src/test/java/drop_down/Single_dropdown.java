package drop_down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_dropdown {

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
			    driver.get("https://www.amazon.com/");
			   WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			   Select s=new Select(dropdown);
			   s.selectByIndex(4);
			   Thread.sleep(3000);
			   s.selectByValue("search-alias=arts-crafts-intl-ship");
			   Thread.sleep(3000);
			   s.selectByVisibleText("Arts & Crafts");
			   //checking the type of drop down
			   System.out.println(s.isMultiple());
			   List<WebElement> alloptions = s.getOptions();
			   //
			   System.out.println(alloptions.size());
			   for(WebElement b:alloptions)
			   {
				  System.out.println(b.getText()); 
			   }
			   
			   
			   

			   
			   
			   
			    
			    
		// TODO Auto-generated method stub

	}

}
