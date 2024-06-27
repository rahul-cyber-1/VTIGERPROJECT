package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link {
	
		@Test
		public static void defaultLink() throws InterruptedException {
			// Write a script to Click On Link Text ?================Passed
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[contains(.,'Quick')]")).click(); // Quick start
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/div[1]/ul/li[3]/a")).click(); // link

			WebElement payments = driver.findElement(By.xpath(
					"//*[@id=\"demoUI\"]/main/section/article/aside/article/aside/div/article/div/div[3]/ul[2]/li[1]/a"));
			payments.click();

			Thread.sleep(3000);
			driver.quit();
		}
			
			
			@Test
			public void linkInNewTab() throws InterruptedException {
				// Write a script to Click on a Link text which open in new tab?================Passed
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demoapps.qspiders.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//button[contains(.,'Quick')]")).click(); // Quick start
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/div[1]/ul/li[3]/a")).click(); // link
				driver.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/div/section/div/div/ul/li[2]/a")).click(); // link
				
				WebElement shippings = driver.findElement(
						By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/article/aside/div/div[3]/ul[2]/li[2]/a"));
				shippings.click();

				Thread.sleep(3000);
				driver.quit();

			}

		}



