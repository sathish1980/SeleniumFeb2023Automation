package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

import BrowserDriver.Browser;
import BrowserDriver.OldBrowser;
import Commons.DriverElements;
import Pages.FacebookloginPage;
import Pages.FacebooklogoutPage;
import Util.ExcelFileHandling;

public class Facebooklogin extends OldBrowser
{
	DriverElements DE = new DriverElements();

	/*@BeforeSuite
	public void launchbrowser()
	{
		launchBrowser("Chrome");
	}*/

	
	@Parameters("browser")
	@BeforeTest
	public void LaunchURL(@Optional String browser)
	{
		launchBrowser(browser);
		driver.get("https://www.facebook.com");
		//getdriver().get("https://www.facebook.com");
	}
	
	@Test(priority=0,dataProvider="facebooklogindetails")
	public void facebookloginandlogout(String uname,String pwd)
	{
		//FacebookloginPage FP = new FacebookloginPage(getdriver());
		FacebookloginPage FP = new FacebookloginPage(driver);
		FP.EnterUsername(uname);
		test.log(LogStatus.INFO,"Entered user is : " +uname);
		FP.EnterPassword(pwd);
		test.log(LogStatus.INFO,"Entered password is : " +pwd);
		FP.ClickLoginButton();
		test.log(LogStatus.INFO,"Login button is sucessfully clicked");
		//FacebooklogoutPage FL = new FacebooklogoutPage(getdriver());
		FacebooklogoutPage FL = new FacebooklogoutPage(driver);
		
		String actuaName = FL.ValidateLoginSucess();
		Assert.assertEquals(actuaName, "Sathish Ramakrishnan");
		FL.ClickOnLogoutDropdown();
		test.log(LogStatus.INFO,"Logout dropdown is sucessfully clicked");
		FL.ClickLogoutButton();	
		//String screenshotPath= DE.takescreenshot(getdriver());
		String screenshotPath= DE.takescreenshot(driver);
		test.log(LogStatus.PASS,"Login and logout is done",test.addScreenCapture(screenshotPath));
	}
	
	
	@Test(priority=1)
	public void facebookInvalidusername()
	{
		//WebElement usname = getdriver().findElement(By.id("email"));
		WebElement usname = driver.findElement(By.id("email"));
		
		DE.EnterAText(usname,"232143543543");
		//WebElement lgbtn = getdriver().findElement(By.name("login"));
		WebElement lgbtn = driver.findElement(By.name("login"));
		
		DE.ClickOnButton(lgbtn);
		//DE.WaitForElementToBePresent(getdriver(), By.xpath("//*[@id='email_container']//div[2]"));
		DE.WaitForElementToBePresent(driver, By.xpath("//*[@id='email_container']//div[2]"));
		
		//System.out.println(getdriver().findElement(By.xpath("//*[@id='email_container']//div[2]")));
		System.out.println(driver.findElement(By.xpath("//*[@id='email_container']//div[2]")));
		
		test.log(LogStatus.PASS,"Duplicate validation is done");

	}
	
	@DataProvider
	public Object[][] facebooklogindetails() throws IOException
	{
		ExcelFileHandling e = new ExcelFileHandling();
		return e.ExcelReaddata("Facebook.xls", "login");
	}
	
	
	@AfterSuite
	public void teardown()
	{
		report.flush();
		//getdriver().quit();
		driver.quit();
	}
}
