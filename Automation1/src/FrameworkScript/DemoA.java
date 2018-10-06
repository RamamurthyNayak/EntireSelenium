package FrameworkScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Framework.BaseTest;


public class DemoA extends BaseTest{
	@Test
	public void testA(){
		LoginACT la=new LoginACT(driver);
		la.setUserName("admin");
		la.setPassword("manager");
		la.clickLogin();
	}
	
	
	@Test
	public void TestB(){
		Reporter.log("HI",true);
		Assert.fail();
		}
	
	
	
}