package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptPopup {
	@Test(priority = 1)
	public void alert() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/alert");
		d.findElement(By.xpath("//*[@id=\"buttonAlert2\"]")).click();
		Alert alt = d.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		System.out.println("accepted");
		d.close();
	}

	@Test(priority = 2)
	public void confirmaccept() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		d.findElement(By.xpath("//*[@id=\"buttonAlert5\"]")).click();
		Alert alt = d.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		System.out.println("accept sucessfull");
		d.close();

	}

	@Test(priority = 3)
	public void confirmcancel() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		d.findElement(By.xpath("//*[@id=\"buttonAlert5\"]")).click();
		Alert alt = d.switchTo().alert();
		Thread.sleep(3000);
		alt.dismiss();
		System.out.println("cancel sucessfull");
		d.close();

	}

	@Test(priority = 4)
	public void prompt() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		d.findElement(By.xpath("//*[@id=\"buttonAlert1\"]")).click();
		Alert alt = d.switchTo().alert();
		Thread.sleep(3000);
		alt.sendKeys("yes");
		alt.accept();
		Thread.sleep(3000);
		WebElement msg = d.findElement(
				By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/section[2]/section/p"));
		System.out.println(msg.getText());
		d.close();
	}

}

	
	
	
	
	

