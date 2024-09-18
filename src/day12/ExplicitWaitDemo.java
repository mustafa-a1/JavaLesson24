package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Explicit Wait Declaration
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username = 
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		username.sendKeys("Admin");

	}

}
