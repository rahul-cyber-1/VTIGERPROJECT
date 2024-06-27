package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test()
	public void singledrag() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		WebElement drag = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(drag, 230, 45).perform();
	}
	
}


