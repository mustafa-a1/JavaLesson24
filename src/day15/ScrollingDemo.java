package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.target.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scrolling by pixels
//		js.executeScript("window.scrollBy(0,800)", "");

		// Scrolling to an element
//		WebElement targetElement = driver
//				.findElement(By.xpath("//h2[normalize-space()='New lower prices on must-haves']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", targetElement);

		// Scrolling to end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
