package DoubleArray;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingDemo {
	@BeforeMethod(groups={"user"})
	public void k1(){
		Reporter.log("k1",true);
	}
	
	@BeforeClass(alwaysRun=true)
	public void m1(){
		Reporter.log("m1",true);
	}

	@Test(priority=1,groups={"user"})
	public void m2(){
		Reporter.log("m2",true);
	}

	@Test(priority=1,groups={"user"},enabled=false)
	public void m3(){
		Reporter.log("m3",true);
	}
	@Test(priority=2,groups={"user"})
	public void m4(){
		Reporter.log("m4",true);
	}
	@Test(priority=3,groups={"Product"})
	public void m5(){
		Reporter.log("m5",true);
	}
	@Test(priority=4,groups={"product"})
	public void m6(){
		Reporter.log("m6",true);
	}
	@Test(priority=5,groups={"Customer"})
	public void m7(){
		Reporter.log("m7",true);
	}
	@Test(priority=6,groups={"Customer"})
	public void m8(){
		Reporter.log("m8",true);
	}
}
