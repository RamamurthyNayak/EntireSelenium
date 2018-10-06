package printingToExcel;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Result.class)
public class DemoA {

	@Test
		public void CreateUser(){
		Reporter.log("User is created",true);
	    Assert.fail();
		
	}
	
@Test
	public void deleteUser(){
	Reporter.log("User is deleted",true);
	}
}
