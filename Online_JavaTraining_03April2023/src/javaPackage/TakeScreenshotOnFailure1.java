package javaPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {

	WebDriver driver;
	
	//ITestResult will provide us the test case execution status and test name
	public void captureScreenshot(ITestResult result) throws Exception {
		if(ITestResult.FAILURE==result.getStatus()) {
			
			//Create the reference of TakeScrenshot Interface and type casting
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			//Use getScreenshotAs() to capture the screenshot in file format
			//getScreenshotAs() method return type = FILE
			
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy the file to specific location
			File destFolder = new File("./screeshots/" + result.getName()+".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName()+ "method() screenshot captured" );
			
			
		}
		
	}
}
