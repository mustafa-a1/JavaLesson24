package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Complete log in function
		driver.findElement(By.name("username")).sendKeys("Admin"); // username
		driver.findElement(By.name("password")).sendKeys("admin123"); // password

		// Click on log in button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Click on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		// click on the dropdown button
		driver.findElement(By.xpath(
				"//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]"))
				.click();

		// select Chief Financial Officer
		driver.findElement(By.xpath("//span[normalize-space()='Chief Financial Officer']")).click();

	}

}
