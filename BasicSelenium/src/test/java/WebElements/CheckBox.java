package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
	@Test
	public static void TableWithCheckbox() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[contains(.,'Quick')]")).click();

		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		driver.findElement(By.xpath("//a[text()='Table With Checkbox']")).click();
		driver.findElement(By.xpath("//td[contains(.,'APPLE')]/preceding-sibling::td/input")).click();
		
		System.out.println("Item Selected");

		Thread.sleep(3000);
		driver.quit();
	}
}


