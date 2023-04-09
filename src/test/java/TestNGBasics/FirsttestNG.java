package TestNGBasics;
import org.testng.annotations.*;

public class FirsttestNG {
	
	@BeforeClass(alwaysRun=true)
	public void Beforeclass()
	{
		System.out.println("Beforeclass");
	}

	
	
	
	
	@BeforeMethod(alwaysRun=true)
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod(alwaysRun=true)
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@Test(priority=-10,groups= {"Sanity","SIT"})
	public void Testcase2()
	{
		System.out.println("Testcase2");
	}
	
	
	@Test(priority=1,enabled=true,description="login",invocationCount=5,invocationTimeOut=1,timeOut=1,groups="SIT",dependsOnMethods="Testcase3")
	public void Testcase1() throws InterruptedException
	{
		System.out.println("Testcase1");
		
		//Thread.sleep(500000);
	}
	
	@Test(priority=0,groups="Sanity",timeOut=1)
	public void Testcase3() throws InterruptedException
	{
		System.out.println("Testcase3");
		Thread.sleep(500000);
	}
	
	
	@AfterClass(alwaysRun=true)
	public void Afterclass()
	{
		System.out.println("Afterclass");
	}
	
	
	@AfterTest(alwaysRun=true)
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}

	
	@AfterSuite(alwaysRun=true)
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeSuite(alwaysRun=true)
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
}
