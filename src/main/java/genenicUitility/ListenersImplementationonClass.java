package genenicUitility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementationonClass implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log("form this"+ methodname+"execution starts!!");
		
	}
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log("form this"+ methodname+"execution successfull!!");
		
	}
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		
		TakesScreenshot tc = (TakesScreenshot)BaseClass.driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder\\"+methodname+".png");
		try {
			Files.copy(src,dest);
		} catch (Exception e) {
			
		}
		
		
		
		
		
	}
	

}
