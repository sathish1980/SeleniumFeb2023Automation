package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobuttonandcheckbox {
	
	public void launch(String expectedBrowser) throws InterruptedException
	{
		int count =0;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/radio.xhtml;");
		driver.manage().window().maximize();
		List<WebElement> browsers = driver.findElements(By.xpath("//*[@id='j_idt87:console1']//td"));
		int counts = browsers.size();
		for(int i=1 ; i <=counts;i++)
		{
			
			String actualbrowser = driver.findElement(By.xpath("//*[@id='j_idt87:console1']//td["+i+"]//label[@for=\"j_idt87:console1:"+count+"\"]")).getText();
			System.out.println(actualbrowser);
			count =count +1;
			if (actualbrowser .equalsIgnoreCase(expectedBrowser))
			{
				//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
				//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[contains(@class,'ui-radiobutton-box')]")));
				
				driver.findElement(By.xpath("//*[@id='j_idt87:console1']//td["+i+"]//div[contains(@class,'ui-radiobutton-box')]")).click();
				break;
			}
		}
		
	}
	
	
	public void checkbox(String[] expectedBrowser) throws InterruptedException
	{
		int count =0;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/checkbox.xhtml;");
		driver.manage().window().maximize();
		List<WebElement> browsers = driver.findElements(By.xpath("//table[@id='j_idt87:basic']//td"));
		int counts = browsers.size();
		for(int i=1 ; i <=counts;i++)
		{
			
			String actualbrowser = driver.findElement(By.xpath("//table[@id='j_idt87:basic']//td["+i+"]//label[@for=\"j_idt87:basic:"+count+"\"]")).getText();
			System.out.println(actualbrowser);
			count =count +1;
			for (String eachcourse : expectedBrowser)
			{
				if (actualbrowser .equalsIgnoreCase(eachcourse))
				{
					//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
					//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[contains(@class,'ui-radiobutton-box')]")));
					
					driver.findElement(By.xpath("//table[@id='j_idt87:basic']//td["+i+"]//div[contains(@class,'ui-chkbox-box')]")).click();
					//break;
				}
			}
		}
		
	}
	
	public void toggle() throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/checkbox.xhtml;");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt87:j_idt100")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-growl-title']")));
		
		String Toast = driver.findElement(By.xpath("//*[@class='ui-growl-title']")).getText();
		System.out.println(Toast);
		driver.findElement(By.id("j_idt87:j_idt100")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-growl-title']")));
		
		String toggleOffToast = driver.findElement(By.xpath("//*[@class='ui-growl-title']")).getText();
		System.out.println(toggleOffToast);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] course ={"c-Sharp","Python","java"};
		Radiobuttonandcheckbox r = new Radiobuttonandcheckbox();
		//r.checkbox(course);
		r.toggle();
	}

}
