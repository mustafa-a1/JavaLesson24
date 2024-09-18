package day15;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaptureScreenshots {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.wikipedia.org/");

		// Full page screenshot
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File srcFile = ts.getScreenshotAs(OutputType.FILE);
//		File targetFile = new File("C:\\Automation 2024\\JavaLesson24\\Screenshot\\image.png");
//		srcFile.renameTo(targetFile);

		// Capture screenshot of single webelement
		WebElement targetEle = driver.findElement(By.xpath("//nav[@aria-label='Top languages']"));
		File src = targetEle.getScreenshotAs(OutputType.FILE);
		File dstn = new File("C:\\Automation 2024\\JavaLesson24\\Screenshot\\wiki.png");
		src.renameTo(dstn);

	}

}
