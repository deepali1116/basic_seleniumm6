package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoappPage {
	//Declaration
	//address of course 
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursetab;
	//addrerss of dropdown web element
	@FindBy(name="addresstype")
	private WebElement cousreadd;
	
	//address of selenium trainng
	@FindBy(xpath=("(//a[text()='Selenium Training'])[1]"))
	private WebElement seleniumtraning;
	
	
	//initilization
	public DemoappPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	

	public void seleniumtraining()
	{
		seleniumtraning.click();
		
	}


	public WebElement getCoursetab() {
		return coursetab;
	}


	


	public WebElement getCousreadd() {
		return cousreadd;
	}



	
	
	
	
	
			
			

}
