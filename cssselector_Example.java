package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector_Example
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:\\www.facebook.com");
		
		// 1. tagname with id using # operator
		
//		WebElement username= driver.findElement(By.cssSelector("input#email"));
//			username.sendKeys("priyankakasat7@gmail.com");

		//2. tagname with classname using dot operator

//		WebElement username=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
//		username.sendKeys("priyankakasat7@gmail.com");
		
		//3.tagname with other attributes
		
//		WebElement username=driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
//		username.sendKeys("priyankakasat7@gmail.com");

		
		//4 tagname with id + other attribute
		
//		WebElement username=driver.findElement(By.cssSelector("input#email[placeholder='Email address or phone number']"));
//			username.sendKeys("priyankakasat7@gmail.com");
		
		//5 tagname with class + other attribute
		
//		WebElement username=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[autofocus='1']"));
//			username.sendKeys("priyankakasat7@gmail.com");
		
		
		//6 tagname with parent child relationship
		
		WebElement username=driver.findElement(By.cssSelector("div>input#email"));
			username.sendKeys("priyankakasat7@gmail.com");
		
		WebElement password= driver.findElement(By.cssSelector("input#pass"));
			password.sendKeys("piyu0703");
			
		WebElement login=driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));
//			login.click();
		
		WebElement createanewaccount= driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
		createanewaccount.click();
			
			
			Thread.sleep(2000);
			
		WebElement firstname=driver.findElement(By.cssSelector("div>input[name='firstname']"));
			firstname.sendKeys("Priya");
			
		WebElement lastname=driver.findElement(By.cssSelector("div>input[name='lastname']"));
			lastname.sendKeys("kasat");
			
		WebElement mobileno=driver.findElement(By.cssSelector("div>input[name='reg_email__']"));
			mobileno.sendKeys("1234567890");
		
		WebElement newpasswd=driver.findElement(By.cssSelector("div>input[name='reg_passwd__']"));
			newpasswd.sendKeys("123456");
		
	}

}
