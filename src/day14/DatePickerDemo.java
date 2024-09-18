package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");

		// Switch to the frame
		driver.switchTo().frame(0);

		// Method1: Use sendkeys()
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/27/2025");

		// Method2: Using date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // Open the calendar

		String year = "2020";
		String month = "April";
		String date = "4";

		// selectFutureDate(driver, year, month, date);
		selectPastDate(driver, year, month, date);

	}

	// Select past date
	public static void selectPastDate(WebDriver driver, String year, String month, String date) {
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	// Select future date
	public static void selectFutureDate(WebDriver driver, String year, String month, String date) {
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("// span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		}
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

}
