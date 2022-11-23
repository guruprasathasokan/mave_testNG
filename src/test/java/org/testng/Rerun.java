package org.testng;

public class Rerun implements IRetryAnalyzer {

	int start = 0;
	int end = 3;

	@Override
	public boolean retry(ITestResult result) {

		if (start < end) {

			start++;
			return true;
		}

		return false;
	}

}
