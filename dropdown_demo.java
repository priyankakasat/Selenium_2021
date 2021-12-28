package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown_demo {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();

		drive.manage().window().maximize();
		drive.get("https://demoqa.com/select-menu");
		
		drive.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		drive.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		WebElement selectvalue=drive.findElement(By.xpath("//*[@id='withOptGroup']"));
		selectvalue.click();
		
		drive.findElement(By.xpath("//div[contains(text(),'A root opt')]")).click();
		
		WebElement selecttitle=drive.findElement(By.xpath("//div[@id='selectOne']"));
		selecttitle.click();
		
		drive.findElement(By.xpath("//*[text()='Ms.']")).click();
		
		
		WebElement selectdrop= drive.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select oldstyle=new Select(selectdrop);
		
	//	oldstyle.selectByIndex(0);
		
	//	oldstyle.selectByValue("4");
		
		oldstyle.selectByVisibleText("Purple");
		
		drive.findElement(By.xpath("//*[text()='Forms']")).click();
		drive.findElement(By.xpath("//*[text()='Practice Form']")).click();
		
		WebElement firstname=drive.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("piya");
		
		WebElement lastname=drive.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("kasat");

		WebElement gmail=drive.findElement(By.xpath("//input[contains(@id,'userEmail')]"));
		gmail.sendKeys("piya@123gmail.com");
		
	//	WebElement clickmenu=drive.findElement(By.xpath("//input[contains(@id,'gender-radio-2')]"));
	//	clickmenu.click();
		
		WebElement number=drive.findElement(By.xpath("//input[contains(@id,'userNumber')]"));
		number.sendKeys("9087123456");

		WebElement date=drive.findElement(By.xpath("//*[contains(@id,'dateOfBirthInput')]"));
		date.click();
			
		WebElement Year=drive.findElement(By.xpath("//select[contains(@class,'react-datepicker__year')]"));
		Select year=new Select(Year);
		
		year.selectByValue("1996");
		
		WebElement Month=drive.findElement(By.xpath("//*[contains(@class,'react-datepicker__month-select')]"));
		Select birthmonth=new Select(Month);
		birthmonth.selectByVisibleText("March");
	
	//	drive.findElement(By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--015')]")).click();
	//	drive.findElement(By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--022')]")).click();
	
		WebElement date1=drive.findElement(By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--022')]"));
		date1.click();
	}

}
