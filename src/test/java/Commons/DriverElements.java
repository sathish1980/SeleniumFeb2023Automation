package Commons;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverElements {
	
	public void EnterAText(WebElement textbox,String textToeneter)
	{
		if(textbox.isDisplayed())
		{
			textbox.clear();
			textbox.sendKeys(textToeneter);
		}
	}
	
	public void ClickOnButton(WebElement button)
	{
		if(button.isDisplayed())
		{
			button.click();
		}
	}

	
	public void WaitForElementToBePresent(WebDriver driver, By waitElement )
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(waitElement));
		
	}
	
	public void WaitForElementToBeClickable(WebDriver driver, WebElement waitElement)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(waitElement));
		
	}
	
	
	public static String takescreenshot(WebDriver driver)
	{
		Date date = new Date();
	      //This method returns the time in millis
	    long timeMilli = date.getTime();
		String date_v= String.valueOf(timeMilli);
		//System.out.println(date_v);
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		File Destinationfile= new File(System.getProperty("user.dir")+"//Screenshot//"+date_v+".png");
		try {
			FileUtils.copyFile(sourcefile, Destinationfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Destinationfile.toString();
	}
}
