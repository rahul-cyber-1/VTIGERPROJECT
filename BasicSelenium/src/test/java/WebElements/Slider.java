package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	@Test
	public void slider() throws InterruptedException{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/slider");
		WebElement slider = d.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/div/input[1]"));
		Actions act=new Actions(d);
		Thread.sleep(3000);
		act.dragAndDropBy(slider, 250,0).perform();
		System.out.println("sliding sucessfull");
		Thread.sleep(3000);
		d.close();
		
		
	}

}


