package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

WebDriver driver;
	
	public void singelselectdropdown()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("sathish");
		Select daydropdown = new Select(driver.findElement(By.id("day")));
		daydropdown.selectByIndex(9);
		Select monthdropdown = new Select(driver.findElement(By.id("month")));
		monthdropdown.selectByValue("8");
		Select yeardropdown = new Select(driver.findElement(By.id("year")));
		yeardropdown.selectByVisibleText("2005");
		
	}
	public void mutiselect() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Select products= new Select(driver.findElement(By.cssSelector("select#first")));
		products.selectByVisibleText("Google");
		Select animals= new Select(driver.findElement(By.cssSelector("select#animals")));
		animals.selectByIndex(2);
		Select multidropdown= new Select(driver.findElement(By.xpath("(//*[@id='second'])[2]")));
		System.out.println(multidropdown.isMultiple());
		//drodpwon.selectByIndex(4);
		if(multidropdown.isMultiple())
		{
			multidropdown.selectByIndex(1);
			multidropdown.selectByValue("bonda");
			multidropdown.selectByVisibleText("Pizza");
			Thread.sleep(1000);
			multidropdown.deselectByValue("pizza");
			Thread.sleep(1000);
			multidropdown.deselectByVisibleText("Donut");
			Thread.sleep(1000);
			multidropdown.deselectAll();

		}
	
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dropdown d = new Dropdown();
		d.mutiselect();
	}


}
