package day12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		String title = driver.getTitle(); 
		System.out.println("The title of the page: " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("The url of the page: " + url);
		
		String sourceCode = driver.getPageSource();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		WebElement hrmLink = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
        hrmLink.click();// click on hrmLink

        Set<String> handles = driver.getWindowHandles();
        System.out.println("The ID of the pages: " + handles);
		
        driver.quit();
	}

}
