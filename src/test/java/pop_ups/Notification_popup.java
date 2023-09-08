package pop_ups;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_popup {

	public static void main(String[] args) {
		
		HashMap<String,Integer>contentString=new HashMap<String,Integer>();
		HashMap<String,Object > profile=new HashMap<String,Object>();
		HashMap<String,Object>prefs=new HashMap<String,Object>();
		contentString.put("notifications", 0);
		profile.put("manage_default_content_setting",contentString);
		prefs.put("profile", profile);
		
		       //Handling notification pop up in edge browser
		        EdgeOptions option=new EdgeOptions();
		        option.setCapability("preferences", prefs);
	
				WebDriverManager.edgedriver().setup();
				//opening the chrome browser
			    WebDriver driver= new EdgeDriver(option);
			    //maximizing the browsers
			    driver.manage().window().maximize();
			    //implicit wait
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    // opens the browser
			    driver.get("https://www.quikr.com/");
			   
		// TODO Auto-generated method stub

	}

}
