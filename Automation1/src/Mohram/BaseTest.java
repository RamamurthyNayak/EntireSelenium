package Mohram;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeMethod
	public void m1(){
		Reporter.log("@BeforeMethod",true);
	}

	@AfterMethod
	public void m2(){
		Reporter.log("@AfteMethod",true);
	}

	@BeforeClass
	public void m3(){
		Reporter.log("@BeforeClass",true);
	}
	@AfterClass
	public void m4(){
		Reporter.log("@AfterClass",true);
	}
	@BeforeTest
	public void m5(){
		Reporter.log("@BeforeTest",true);
	}
	@AfterTest
	public void m6(){
		Reporter.log("@AfterTest",true);
	}
	@BeforeSuite
	public void m7(){
		Reporter.log("@BeforeSuite",true);
	}
	@AfterSuite
	public void m8(){
		Reporter.log("@AfterSuite",true);
	}
}
