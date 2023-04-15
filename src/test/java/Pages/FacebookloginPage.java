package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.DriverElements;

public class FacebookloginPage extends DriverElements {
	
	@FindBy (id="email")
	WebElement usname;
	@FindBy (id="pass")
	WebElement pwrd;
	@FindBy (name="login")
	WebElement lgbtn;
	@FindBy (linkText="Forgotten account?")
	WebElement FBlinktext;
	@FindBy (linkText="Create new account")
	WebElement CRTAcct;
	
	WebDriver  driver;
	
	public FacebookloginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUsername(String uname)
	{
	//WebElement usname = driver.findElement(By.id("email"));
	EnterAText(usname,uname);
	}
	
	public void EnterPassword(String pwd)
	{
	//WebElement pwrd = driver.findElement(By.id("pass"));
	EnterAText(pwrd,pwd);
	}
	
	public void ClickLoginButton()
	{
	//WebElement lgbtn = driver.findElement(By.name("login"));
	ClickOnButton(lgbtn);
	}
	
	
	public void ClickForgotPasswordLink()
	{
		//WebElement FBlinktext = driver.findElement(By.linkText("Forgotten account?"));
		ClickOnButton(FBlinktext);
	}
	
	public void ClickOnCreateAccoutButton()
	{
		//WebElement CRTAcct = driver.findElement(By.linkText("Create new account"));
		ClickOnButton(CRTAcct);
	}


}
