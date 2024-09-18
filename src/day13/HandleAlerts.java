package day13;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click(); // Click on JS alert
//		Thread.sleep(2000);

//		Alert myAlert = driver.switchTo().alert();
//		myAlert.accept();

//		driver.switchTo().alert().accept();

		// Handling confirmation alert Ok/cancel

		// Click on JS confirm button
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept(); // Closes the alert using ok button
//		driver.switchTo().alert().dismiss(); // Closes the alert using cancel button

		// Handling prompt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(1500);

		Alert myAlert = driver.switchTo().alert();
		System.out.println("Text message on alert: " + myAlert.getText());
		myAlert.sendKeys("Alerts!");
		myAlert.accept();

	}

}
