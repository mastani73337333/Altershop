package utility_package;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import altershop_testcases.Altershop_Baseclass;



public class Report implements ITestListener
{
	public ExtentSparkReporter reporter; // basic info about document
	public ExtentReports extent; // basic info about user
	public ExtentTest test; // basic info about testing

	public void onStart(ITestContext context) {

		reporter = new ExtentSparkReporter("D:\\testng workspace\\Altershop\\report\\newreport.html");

		// provide the basic information about the document

		reporter.config().setDocumentTitle("Altershop  document");
		reporter.config().setReportName("Multiple Functionlaity Report");
		reporter.config().setTheme(Theme.STANDARD);
		// provide the basic information about the user

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("user", "mastanbi");
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("OS", "Windows,Macos,Linux");
		extent.setSystemInfo("Browser", "chrome");
	}

	public void onTestSuccess(ITestResult tr) {

		test = extent.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult tr) {
		test = extent.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		String screenshotPath=System.getProperty("user.dir")+"\\screenshots\\"+tr.getName()+".png";
		File f = new File(screenshotPath); 
		try {
			String imgPath=new Altershop_Baseclass ().capturescreen(tr.getName());
			test.addScreenCaptureFromPath(imgPath);//add screenshot into extent report
			} 
		catch (IOException e) 
				{
				e.printStackTrace();
				}
		
	}
		

	public void onTestSkipped(ITestResult tr) {

		test = extent.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
		
		
	}

	public void onFinish(ITestContext context) {

		extent.flush();
	}


}
