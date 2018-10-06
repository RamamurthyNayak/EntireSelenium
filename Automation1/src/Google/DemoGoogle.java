package Google;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoGoogle {
	
	@BeforeClass
		public void openApp(){
		Reporter.log("openApp",true);

}
	
	@AfterClass
	public void closeApp(){
	Reporter.log("closeApp",true);

}

	
	@Test(priority=-1)
	public void createUser(){
	Reporter.log("createUser",true);

}

	
	@Test(priority=1)
	public void editUser(){
	Reporter.log("editUser",true);

}

	
	@Test(invocationCount=5)
	public void deleteUser(){
	Reporter.log("deleteUser",true);

}

	@Test(priority=3,invocationCount=5)
	public void countRemainingUser(){
	Reporter.log("countRemainingUser",true);

}

	
}
