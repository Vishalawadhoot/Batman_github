package Reporting_tools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport 
{
	@Test
	public void test1()
	{
		ExtentReports rep = new ExtentReports("./reports/r1.html");
		ExtentTest test = rep.startTest("tc1");
		test.log(LogStatus.PASS, "pass");
		test.log(LogStatus.FAIL, "fail");
		test.log(LogStatus.SKIP, "skip");
		rep.endTest(test);
		rep.flush();
		
	}
}
