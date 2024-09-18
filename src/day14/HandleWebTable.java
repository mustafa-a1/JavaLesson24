package day14;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		// XPath for Java

		// table[@name='BookTable']//tr[6]/td[3]

		// Find out number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows in BookTable is: " + rows); // 7

		// Number of Columns in booktable
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns in BookTable is: " + columns); // 4

		// Print all the values from book table
		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= columns; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(value + " ");
			}
			System.out.println();
		}

		// Print all the books whose author is Amit

		for (int r = 2; r <= rows; r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]"))
					.getText();
			if (authorName.equals("Amit")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[1]"))
						.getText();
				System.out.println(authorName + "  >>  " + bookName);
			}

		}

		// Calculate the total price of all the books from the table

		int total = 0;
		for (int r = 2; r <= rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[4]")).getText();
			total += Integer.parseInt(price);
		}

		System.out.println("The total price is: " + total);

	}

}
