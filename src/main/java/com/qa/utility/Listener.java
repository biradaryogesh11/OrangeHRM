package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class Listener extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	  logger.info("Test case executaion started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test case executaion successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test method is failed");
		ScreenShot.getScreenshot(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test method is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}
	@Override
	public void onFinish(ITestContext context) {
		
	}

}
