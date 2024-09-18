package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Send keys with javascriptexecutor
		js.executeScript("arguments[0].setAttribute('value','Mustafa')", inputBox);

		WebElement gender = driver.findElement(By.xpath("//label[@for='male']"));

		// Click on male gender
		js.executeScript("arguments[0].click()", gender);

	}

}
