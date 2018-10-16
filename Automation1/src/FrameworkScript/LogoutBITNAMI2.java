package FrameworkScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Framework.WebGeneric;
//POM class


public class LogoutBITNAMI2 {
	//declaration

	@FindBy(id="welcome")
	private WebElement wlcmBTN;

	@FindBy(xpath="//li/a[.='Logout']")
	private WebElement lgotBTN;


	//initialization
	public LogoutBITNAMI2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}	

	//Utilization
	public void clickWelcome(){
		wlcmBTN.click();
	}


	public void clickLogout(WebDriver driver,long time){

		WebGeneric.waitForVisibilityAndClick(driver, 10, wlcmBTN);
		lgotBTN.click();
		
	}


}

