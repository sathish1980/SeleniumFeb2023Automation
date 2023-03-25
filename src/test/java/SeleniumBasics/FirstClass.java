package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {
	
	public void launch()
	{
		/*ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);*/
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(300,300));
		//driver.manage().window().minimize();
		//driver.close();
		//driver.quit();
		//driver.get("https://www.gmail.com/");
		driver.navigate().to("https://www.facebook.com/");
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		//WebElement username=driver.findElement(By.id("email"));
		//WebElement username=driver.findElement(By.name("email"));
		//WebElement username=driver.findElement(By.className("inputtext _55r1 _6luy"));
		//WebElement username=driver.findElement(By.cssSelector("input#email"	));
		//WebElement username=driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy"	));
		//WebElement username=driver.findElement(By.cssSelector("input[data-testid='royal_email']"	));
		//WebElement username=driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy[data-testid='royal_email']"));
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("sathishkumar");
		//username.clear();
		username.sendKeys("new");
		
		driver.findElement(By.id("email")).sendKeys("sara");
		driver.findElement(By.id("email")).sendKeys("sara");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("pass")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass F = new FirstClass();
		F.launch();
	}

}
