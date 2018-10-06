package FBlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbLogout2 {

	//declaration

	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement lgoBTN;

	//initialization

	public fbLogout2(WebDriver d){
		PageFactory.initElements(d, this);
	}	

	//Utilization
	public void clickLogoutButton(){
		lgoBTN.click();
	}

}	

