package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2#google_vignette");

		// Click on the dropDown button
		driver.findElement(By.xpath("//span[contains(@class,'multiselect')]")).click();

		// Select single item from the list - Java
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		// Count how many options are available
		List<WebElement> availableOptions = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		// Print the available options
		System.out.println("Available options are: " + availableOptions.size());
	
		// Print all the options 
		for (WebElement ops : availableOptions) {
			System.out.println(ops.getText());
		}
		
		// Select multiple options
		for (WebElement ops : availableOptions) {
			String option = ops.getText();
			if (option.equals("Java") || option.equals("Oracle")) {
				ops.click();
			}
		}
		
	}

}
