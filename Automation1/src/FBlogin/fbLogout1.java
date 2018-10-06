package FBlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbLogout1 {

	//declaration

	@FindBy(id="userNavigationLabel")
	private WebElement lgoLNK;

	//initialization

	public fbLogout1(WebDriver d){
		PageFactory.initElements(d, this);
	}	

	//Utilization

	public void clickLogoutlink(){
		lgoLNK.click();
	}

}	

