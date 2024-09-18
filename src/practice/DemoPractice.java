package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.cssSelector("#name")).sendKeys("Mustafa Abdulwahed");
		driver.findElement(By.cssSelector("#email")).sendKeys("m.a@gmail.com");
		driver.findElement(By.cssSelector("#phone")).sendKeys("7181231049");
		driver.findElement(By.cssSelector("#textarea")).sendKeys("123 Beaver St");
		
		driver.findElement(By.cssSelector("#male")).click();
		List<WebElement> days = driver.findElements(By.cssSelector("div>input[type='checkbox']"));
		for (WebElement element : days) {
			element.click();
		}
		
		WebElement dDown = driver.findElement(By.cssSelector("#country"));
		Select dropDown = new Select(dDown);
		dropDown.selectByIndex(6);
		
		WebElement color = driver.findElement(By.cssSelector("#colors"));
		Select colors = new Select(color);
		colors.selectByValue("yellow");
		
		driver.findElement(By.cssSelector("input#datepicker")).sendKeys("08/29/2025");
		
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.partialLinkText("open cart")).sendKeys(clicklnk);
		
		driver.findElement(By.partialLinkText("orange")).sendKeys(clicklnk);
		
		int rowSize = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int colSize = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		for (int i = 2; i <= rowSize; i++) {
			for (int j = 1; j <= colSize; j++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
