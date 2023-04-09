package TestNGBasics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClass {

	@BeforeClass(alwaysRun=true)
	public void Beforeclass()
	{
		System.out.println("Beforeclass in second class");
	}

	
	@BeforeTest(alwaysRun=true)
	public void BeforeTest()
	{
		System.out.println("BeforeTest in second class");
	}
	@Test(priority=0,groups="Sanity",timeOut=1)
	public void Testcase4() throws InterruptedException
	{
		System.out.println("Testcase4");
	}
	
	@Test(priority=1,groups="Sanity",timeOut=1)
	public void Testcase5() throws InterruptedException
	{
		System.out.println("Testcase5");
	}
	
	@Test(priority=2,groups="Sanity",timeOut=1)
	public void Testcase6() throws InterruptedException
	{
		System.out.println("Testcase6");
	}
	
}
