package FBNewApproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbLogin {

	//declaration

	@FindBy(id="email")
	private WebElement unTB;

	@FindBy(id="pass")
	private WebElement pwTB;

	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBTN;

	@FindBy(id="userNavigationLabel")
	private WebElement lgoLNK;

	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement lgoBTN;

	//initialization
	public fbLogin(WebDriver d){
		PageFactory.initElements(d, this);
	}	


	//Utilization
	public void setUserName(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	public void clickLogin(){
		loginBTN.click();
	}
	public void clickLogoutlink(){
		lgoLNK.click();
	}
	public void clickLogoutButton(){
		lgoBTN.click();
	}

}




