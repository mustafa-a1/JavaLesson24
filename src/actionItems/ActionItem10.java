package actionItems;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionItem10 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		driver.findElement(By.partialLinkText("Z")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		List<WebElement> column = driver.findElements(By.xpath("//table//th[1]"));

		System.out.println(rows.size()); // 44

		for (int i = 1; i < rows.size(); i++) {
			for (int j = 1; j <= column.size(); j++) {
				WebElement value = driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[1]"));
				System.out.println(value.getText());
			}
		}

	}

}
