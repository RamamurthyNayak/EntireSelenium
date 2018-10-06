package Mohram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest {


	@Test
	public void TestB1(){
		Reporter.log("@Test-TestB1",true);
	}
	
	@Test
	public void TestB2(){
		Reporter.log("@Test-TestB2",true);
	}
	
	
}
