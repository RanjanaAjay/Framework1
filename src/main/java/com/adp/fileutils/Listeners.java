package com.adp.fileutils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{
	static int passcount = 0, failcount = 0;
	public void onTestStart(ITestResult result) {
		String name = result.getName();
		Reporter.log("Test is Started" + name, true);
		
	}

	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		Reporter.log("test success " + name, true);

		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
