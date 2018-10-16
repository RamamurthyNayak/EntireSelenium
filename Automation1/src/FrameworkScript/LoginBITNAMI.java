package FrameworkScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
//POM class


public class LoginBITNAMI {
	
	private WebDriver driver;
	
	//declaration
	@FindBy(id="txtUsername")
	private WebElement unTB;

	@FindBy(id="txtPassword")
	private WebElement pwTB;

	@FindBy(id="btnLogin")
	private WebElement loginBTN;
	

	//initialization
	public LoginBITNAMI(WebDriver driver){
		this.driver=driver;
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

