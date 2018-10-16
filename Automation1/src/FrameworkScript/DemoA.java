package FrameworkScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Framework.BaseTest;
import Framework.Utility;
import Framework.WebGeneric;


public class DemoA extends BaseTest{
	//	@Test
	//	public void testOLD(){
	//		LoginACT la=new LoginACT(driver);
	//		la.setUserName("admin");
	//		la.setPassword("manager");
	//		la.clickLogin();
	//	}


	@Test(priority=1)
	public void TestA(){
		//Take the input data from excel file
		String un = Utility.getXLData(DATA_PATH, "Sheet1", 1, 0);
		String pw = Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);

		String dashboardPageURL = Utility.getXLData(DATA_PATH, "Sheet1", 1, 2);
		String loginPageURL=Utility.getXLData(DATA_PATH, "Sheet1", 1, 3);
		//Enter valid user name and password

		LoginBITNAMI btn=new LoginBITNAMI(driver);
		btn.setUserName("admin");
		btn.setPassword("admin123");
		btn.clickLogin();
		//Verify that dashboard page is displayed
		WebGeneric.verifyURL(driver, lngETO, dashboardPageURL);
		LogoutBITNAMI2 btn2=new LogoutBITNAMI2(driver);
		btn2.clickWelcome();
		btn2.clickLogout(driver, lngETO);

		//Verify that Login page is displayed

		WebGeneric.verifyURL(driver, lngETO, loginPageURL);
		

	}



}