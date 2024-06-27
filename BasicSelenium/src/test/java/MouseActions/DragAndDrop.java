package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void dragPosition() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		 Actions act =new Actions(driver);
		 WebElement dragmc=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		 WebElement dropma=driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[1]"));
		 act.dragAndDrop(dragmc, dropma).perform();
		 Thread.sleep(1000);
		 WebElement draglc=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		 WebElement dropla=driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[2]"));
		 act.dragAndDrop(draglc, dropla).perform();
		 Thread.sleep(1000);
		 WebElement dragmoc=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		 WebElement dropmac=driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[1]"));
		 act.dragAndDrop(dragmoc, dropmac).perform();
		 Thread.sleep(1000);
		 WebElement draglapc=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		 WebElement droplapac=driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[2]"));
		 act.dragAndDrop(draglapc, droplapac).perform();
	}

}



