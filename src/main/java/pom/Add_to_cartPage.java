package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_cartPage {
	//declaration
	//address of +
	@FindBy(id="add")
	 private WebElement addbtn;
	
	
	//address of addtocart
	@FindBy(xpath="//button[contains( text()=' Add to cart')]")
	private WebElement cartbtn;
	
	//initilazation
	public Add_to_cartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utlization
	public  void cartbtn()
	{
		 cartbtn.click();
	}
	public WebElement getaddbtn() {
		return addbtn;
	}
	
	
	

}
