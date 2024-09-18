package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mortgagecalculator.org/");

		WebElement calc = driver.findElement(By.xpath("//a[normalize-space()='Mortgage Calcs']"));
		WebElement fixed = driver.findElement(By.xpath("//a[normalize-space()='15 yr Fixed']"));

		// Create an object of actions class
		Actions actions = new Actions(driver);

		// Mouse hover action
//		actions.moveToElement(calc).moveToElement(fixed).click().build().perform();
//		actions.moveToElement(calc).moveToElement(fixed).click().perform();
		
		Action atn = actions.moveToElement(calc).moveToElement(fixed).click().build();
		atn.perform();
	}

}
