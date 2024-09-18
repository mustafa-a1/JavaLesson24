package day13;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		// driver.findElement(By.xpath("//input[@id='sunday']")).click();

		// Find out total number of check boxes

		List<WebElement> checkBoxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox'] "));
		System.out.println("Total checkboxes: " + checkBoxes.size()); // 7

		// Select all the checkBoxes
		// get each of the element of the list and perform click
//		for (int i = 0; i < checkBoxes.size(); i++) {
//			checkBoxes.get(i).click();
//		}

		// For-Each loop (Enhanced for-loop)
//		for (WebElement checkBox : checkBoxes) {
//			checkBox.click();
//		}

		// Select last 2 checkBoxes

		for (int i = 5; i < checkBoxes.size(); i++) {
			checkBoxes.get(i).click();
		}

		// Select first 2
		for (int i = 0; i < 2; i++) {
			checkBoxes.get(i).click();
		}

		// Deselecting checkBoxes if those are already selected

		for (WebElement box : checkBoxes) {
			if (box.isSelected()) {
				box.click();
			}
		}

	}

}
