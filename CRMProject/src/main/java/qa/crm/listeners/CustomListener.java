package qa.crm.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import qa.crm.base.TestBase;

public class CustomListener extends TestBase implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test");
		failed(result.getMethod().getMethodName());
	}
	
}
