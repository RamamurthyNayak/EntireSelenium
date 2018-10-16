package FrameworkScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
//POM class


public class LoginACT {
	//declaration
	@FindBy(id="username")
	private WebElement unTB;

	@FindBy(name="pwd")
	private WebElement pwTB;

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;


	//initialization
	public LoginACT(WebDriver driver){
		PageFactory.initElements(driver, this);
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



}

