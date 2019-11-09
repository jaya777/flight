package ticket;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Booking {

	
	
	
	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\Desktop\\TestYantra\\selenium1\\src\\main\\chrome\\chromedriver.exe");


		driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/flights");
	}

	@Test
	public void book() throws AWTException, InterruptedException
	{

		Robot r =new Robot();

		r.keyPress(KeyEvent.VK_TAB);		

		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);	

		driver.findElement(By.xpath("//input[@id='OneWay']")).click();

		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Hyderabad");

		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");

		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector("#ui-datepicker-div > div.monthBlock.first > table > tbody > tr:nth-child(2) > td.weekEnd.undefined.selected > a")).click();

		Select sc= new Select(driver.findElement(By.id("Adults")));

		sc.selectByIndex(1);
		Thread.sleep(4000);

		Select sc1= new Select(driver.findElement(By.id("Childrens")));


		sc1.selectByIndex(1);

		Select sc2= new Select(driver.findElement(By.id("Infants")));


		sc2.selectByIndex(1);


		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();

		Thread.sleep(5000);


		//driver.findElement(By.xpath("//img[@style='-webkit-user-select: none;margin: auto;']")).click();

		Thread.sleep(3000);

		r.mouseMove(1030, 260);
		Thread.sleep(3000);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);

		Thread.sleep(2000);

		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		driver.findElement(By.xpath("(//button[@class='booking'])[1]")).click();

		driver.findElement(By.xpath("(//input[@class='booking'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@title='Your email address']")).sendKeys("arjunboya88@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='LoginContinueBtn_1']")).click();

		Thread.sleep(5000);
		Select sc9=new Select(driver.findElement(By.id("AdultTitle1")));

		sc9.selectByVisibleText("Mr");

		driver.findElement(By.id("AdultFname1")).sendKeys("arjun");	

		driver.findElement(By.id("AdultLname1")).sendKeys("boya");
		Select sc10=new Select(driver.findElement(By.id("AdultTitle2")));

		sc10.selectByVisibleText("Ms");

		driver.findElement(By.xpath("//input[@name='AdultFname2']")).sendKeys("anu");

		driver.findElement(By.id("AdultLname2")).sendKeys("boya");
		Select sc11=new Select(driver.findElement(By.id("ChildTitle1")));

		sc11.selectByVisibleText("Mstr");

		driver.findElement(By.id("ChildFname1")).sendKeys("anurudh");

		driver.findElement(By.id("ChildLname1")).sendKeys("boya");
		Select sc6=new Select(driver.findElement(By.xpath("//select[@id='ChildDobDay1']")));

		sc6.selectByValue("4");
		Thread.sleep(2000);

		Select sc7=new Select(driver.findElement(By.id("ChildDobMonth1")));    
		sc7.selectByVisibleText("Apr");

		Select sc8=new Select(driver.findElement(By.xpath("//select[@name='ChildDobYear1']")));    
		sc8.selectByIndex(2);

		Select sc12=new Select(driver.findElement(By.id("InfantTitle1")));

		sc12.selectByVisibleText("Miss");


		driver.findElement(By.id("InfantFname1")).sendKeys("rashi");
		driver.findElement(By.id("InfantLname1")).sendKeys("boya");

		Select sc3=new Select(driver.findElement(By.xpath("//select[@id='InfantDobDay1']")));

		sc3.selectByValue("4");
		Thread.sleep(2000);

		Select sc4=new Select(driver.findElement(By.id("InfantDobMonth1")));    
		sc4.selectByVisibleText("Apr");

		Select sc5=new Select(driver.findElement(By.xpath("//select[@name='InfantDobYear1']")));    
		sc5.selectByIndex(2);

		Thread.sleep(2000);
		driver.findElement(By.id("mobileNumber")).sendKeys("9959480881");

		driver.findElement(By.id("travellerBtn")).click();

	}




	@AfterTest
	public void done()
	{
		//driver.close();


	}

}
