package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindows {
	
	@Test
	public void newWindow()
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		d.findElement(By.xpath("//a[text()='Open in new window']")).click();
		
		
	}

}
