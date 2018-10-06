package JSP;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoB {
	@Parameters({"city","area"})
	
	@Test
	public void testA(@Optional("delhi") String c,@Optional("market") String a){
		Reporter.log(c+a,true);
		
		
		//Imp Note: Always run the program from XML file section,whenever we  pass parameters
		

}}
