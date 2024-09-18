package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		// Identify the webelement
		WebElement dropDown = driver.findElement(By.xpath("//*[@id='country']"));

		// Create an object of Select Class
		Select countryDropdown = new Select(dropDown);
		
		// By value
		countryDropdown.selectByValue("canada");
		
		// By index
		countryDropdown.selectByIndex(0); // United States
		
		// By visible text
		countryDropdown.selectByVisibleText("Brazil");
	}

}
