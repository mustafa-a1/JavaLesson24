package day15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));

		Actions act = new Actions(driver);

		// Right click on the button
		act.contextClick(button).perform();

		// Click on copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(3000);
		// Close the alert box
		driver.switchTo().alert().accept();

	}

}
