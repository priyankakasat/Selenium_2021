package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class facebook_username 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		
		//TextBox xpath
	/*	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("priyankakasat7@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123430703");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();			*/
	
	//	WebElement username=driver.findElement(By.xpath("//*[@id=\"email\"]"));			// WebElement is Return type of findElement & also interface
	//	WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	//	WebElement login= driver.findElement(By.xpath("//*[@name=\"login\"]"));
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement login= driver.findElement(By.xpath("//*[@name=\"login\"]"));
		WebElement createapage= driver.findElement(By.className("_8esh"));
		
		
		username.sendKeys("priyankakasat7@gmail.com");			
		password.sendKeys("1234563314");
		login.click();
		createapage.click();
	
		username.clear();							// for clear value

		
		
		
	}
}
