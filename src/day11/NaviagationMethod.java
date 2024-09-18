package day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagationMethod {


    public static void main(String[] args) throws InterruptedException {
        
    	WebDriver driver = new ChromeDriver();// it would launch chrome browser 
        driver.manage().window().maximize();//Maximizes the window
        driver.get("https://www.google.com/");//Launching google page
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");// navigating to amazon website
        Thread.sleep(2000);
        driver.navigate().to("https://www.target.com/");// navigating to target website
        Thread.sleep(2000);
        //going back
        driver.navigate().back(); //amazon
        Thread.sleep(2000);
        driver.navigate().back(); //google
        Thread.sleep(2000);
        //going forward
        driver.navigate().forward(); //amazon
        Thread.sleep(2000);
        //refresh page
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
	
	
    }
}
