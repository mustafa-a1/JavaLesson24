package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxisDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// Max window
		driver.manage().window().maximize();
		// Launch google home page
		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Olympic 2024");
		searchBox.sendKeys(Keys.ENTER);
		driver.close();
	}

}
