package BrowserDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser 
{
 public static WebDriver driver;
	public void launchBrowser(String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = null;
		}
		
	}
}
