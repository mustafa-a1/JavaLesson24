package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']")); // Frame1

		// Change the focus of the driver to frame 1
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Selenium");

		// Going back to the home screen
		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']")); // Frame2

		// Change the focus of the driver to frame 2
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");

		// Going back to the home screen
		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']")); // Frame3

		// Change the focus of the driver to frame 3
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Journey");

		// Switch to inner frame
		driver.switchTo().frame(0);

		// Select the radio button
		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();

		// Going back to the home screen
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']")); // Frame4

		// Change the focus of the driver to frame 4
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Finally");
		
		
	}

}
