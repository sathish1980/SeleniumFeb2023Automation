package BrowserDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class OldBrowser 
{
	 public static WebDriver driver;
	 public static ExtentReports report;
	 public static ExtentTest test;
	 private String reportPath=System.getProperty("user.dir");
	
	public void launchBrowser(String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-Notifications");
			driver = new ChromeDriver(options);
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			EdgeOptions options = new EdgeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-Notifications");
			driver = new EdgeDriver(options);
		}
		else
		{
			driver = null;
		}
		System.out.println(reportPath);
		report = new ExtentReports(reportPath+"//Report//extentreport.html",true);
		test= report.startTest("Facebook Automation report");	
	
	}
}
