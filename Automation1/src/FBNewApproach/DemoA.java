package FBNewApproach;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class DemoA {
	@Test
	public void Method1(){
		Reporter.log("Renamed method",true);
	}
	
}
