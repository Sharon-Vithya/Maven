package com.Runner_After;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Utility implements IRetryAnalyzer{
	int start_point =1;
	int end_point = 3;
	

	@Override
	public boolean retry(ITestResult result) {
		if (start_point<=end_point) {
			start_point++;
			return true;
			
		}
		return false;
		
	}

} 
