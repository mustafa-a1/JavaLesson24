package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
		
		WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
		
		boolean status = male.isDisplayed();
		System.out.println("Male button is displayed: " + status);
		
	    status = male.isEnabled();
		System.out.println("Male button is enabled: " + status);
		
		status = male.isSelected();
		System.out.println("Male button is selected: " + status);
		
//		boolean result = searchField.isDisplayed();
//		System.out.println(result);
//		
//		boolean result2 = searchField.isEnabled();
//		System.out.println(result2);
//		
//		searchField.sendKeys("iPhone 15 Plus");
		
		
		
		
		
	}

}
