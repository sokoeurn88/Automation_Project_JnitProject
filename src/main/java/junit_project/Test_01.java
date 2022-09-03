package junit_project;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_01 {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/101/");
	}
	
	@Test
	public void validateCheckBox() {
		driver.findElement(By.name("allbox")).click();
		driver.findElement(By.name("data")).sendKeys("sokoeurn99aaa");
		
		
		Select sel = new Select(driver.findElement(By.name("category")));
		sel.selectByVisibleText("autoTest212");
		
		driver.findElement(By.name("categorydata")).sendKeys("Techfios_student_JuneQA2021");
		
		Select sel1 = new Select(driver.findElement(By.name("colour")));
		sel1.selectByVisibleText("Burnt Orange");

		Select selday = new Select(driver.findElement(By.name("due_day")));
		selday.selectByVisibleText("10");
		
		Select selmonth = new Select(driver.findElement(By.name("due_month")));
		selmonth.selectByVisibleText("Sep");

		Select selyear = new Select(driver.findElement(By.name("due_year")));
		selyear.selectByVisibleText("2022");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();
		
		
		
		
		driver.findElement(By.name("submit")).click();	
		driver.findElement(By.name("submit")).click();	
	}
	
	

	//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
