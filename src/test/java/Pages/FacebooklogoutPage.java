package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Commons.DriverElements;

public class FacebooklogoutPage extends DriverElements{
	
	WebDriver driver;
	public FacebooklogoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String ValidateLoginSucess() 
	{
		final String profileElement="//*[text()='Sathish Ramakrishnan']";
		By profilename=By.xpath(profileElement);
		WaitForElementToBePresent(driver, profilename);
		String actualProfileName= driver.findElement(profilename).getText();
		return actualProfileName;
	}
	
	public void ClickOnLogoutDropdown()
	{
		WebElement logoutdropdownbutton = driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']"));
		WaitForElementToBeClickable(driver, logoutdropdownbutton);
		ClickOnButton(logoutdropdownbutton);
	}
	
	public void ClickLogoutButton()
	{
		//final String LogoutDropdown="//span[text()='Log Out']";
		By logoutbutton = By.xpath("//span[text()='Log Out']"); 
		WaitForElementToBePresent(driver, logoutbutton);
		ClickOnButton(driver.findElement(logoutbutton));
	}

}
