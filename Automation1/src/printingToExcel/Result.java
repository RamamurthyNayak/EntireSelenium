package printingToExcel;

import org.apache.bcel.classfile.Utility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Result implements ITestListener {
	static int passCount=0,failCount=0;
	

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is Pass ",true);
		passCount++;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is Fail ",true);
		passCount++;
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Pass:"+passCount,true);
		Reporter.log("Fail:"+failCount,true);
		utility.writeToXL("./result/Summary.xlsx", passCount, failCount);
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



}
