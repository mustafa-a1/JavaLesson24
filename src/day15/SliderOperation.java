package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Location before sliding min: " + min_slider.getLocation()); // (59, 251)

		// Sliding the min slider
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 251).perform();
		System.out.println("Location after sliding min: " + min_slider.getLocation());

		WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Location before sliding max: " + max_slider.getLocation());

		// Sliding the max slider
		act.dragAndDropBy(max_slider, -100, 251).perform();
		System.out.println("Location after sliding max: " + max_slider.getLocation());
	}

}
