package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		// Switch to the frame
		driver.switchTo().frame("iframeResult");
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		// Clear box 1
		box1.clear();
		box1.sendKeys("Welcome to Selenium");
		
		// Double click
		Actions action = new Actions(driver);
		action.doubleClick(button).perform();
		
		// Validation in box2
		String text = box2.getAttribute("value");
		
		if (text.equals("Welcome to Selenium")) {
			System.out.println("Text copied .....");
		} else {
			System.out.println("Text did not copy");
		}
		
	}

}
