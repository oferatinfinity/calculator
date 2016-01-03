package com.ilad;

import java.util.concurrent.TimeUnit;

import org.junit.runner.Result;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		Reporter.log("test ended");
	}

	@Override
	public void onStart(ITestContext arg0) {
		Reporter.log("suit started");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		Reporter.log("some passed and some failed");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		Reporter.log("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		Reporter.log("test skipped");
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		Reporter.log("Teststarted running:"  + arg0.getMethod().getMethodName() + " at:" );
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		Reporter.log("test" );
	}

}
