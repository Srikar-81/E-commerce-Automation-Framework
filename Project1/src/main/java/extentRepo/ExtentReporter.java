package extentRepo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReporter {
	public static ExtentReports getExtentReport() {
		String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("QA Automation Results");
		reporter.config().setDocumentTitle("QA Automation Test Results");
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("OS","Windows-11");
		extentReport.setSystemInfo("Executed By","Software Tester");
		return extentReport;
	}
}
