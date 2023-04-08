package Commons;

import org.openqa.selenium.WebElement;

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

}
