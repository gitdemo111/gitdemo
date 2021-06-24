package com.test.coreframework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LearningListener implements IRetryAnalyzer  {
	
	int retrycount=1;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		
		if (retrycount<=3)
		{
			
			System.out.println("Re-running the testcase "+result.getName()+" retry count "+retrycount);
			
			retrycount++;
			return true;
			
		}
		
		
		
		
		return false;
	}
	
	// How will you re-run the failed testcases in testNG
	
	// 1. using testng-failed.xml   2. IRetryAnalyzer - interface

	
	
	
	

}
