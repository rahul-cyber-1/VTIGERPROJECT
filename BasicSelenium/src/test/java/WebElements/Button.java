package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button {
	
		@Test
		public static void defaultClick() throws InterruptedException {
			// Write a script to Click On A Button ?==========Passed
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[contains(.,'Quick')]")).click(); // Quick start
			driver.findElement(
					By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/div[1]/ul/li[2]/a/section[1]")).click(); // button

			WebElement satisfybutton = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
			satisfybutton.click();

			WebElement concernButton = driver.findElement(By.xpath("//*[@id=\"btn3\"]"));
			concernButton.click();
			driver.findElement(By.xpath("//*[@id=\"btn6\"]")).click();

			Thread.sleep(3000);
			driver.quit();

		}

		@Test
		public static void verifyTheButton() throws InterruptedException {
			// How to verify the button is clicked?================Passed
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[contains(.,'Quick')]")).click(); // Quick start
			driver.findElement(
					By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/div[1]/ul/li[2]/a/section[1]")).click(); // button

			WebElement satisfybutton = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
			satisfybutton.click();
			if (satisfybutton.isSelected()) {
				System.out.println("Is clicked");
			} else {
				System.out.println("is not clicked");
			}

			WebElement concernButton = driver.findElement(By.xpath("//*[@id=\"btn3\"]"));
			concernButton.click();
			if (concernButton.isEnabled()) {
				System.out.println("Is clicked");
			} else {
				System.out.println("is not clicked");
			}
			WebElement rating = driver.findElement(By.xpath("//*[@id=\"btn6\"]"));
			rating.click();
			if (rating.isEnabled()) {
				System.out.println("Is clicked");
			} else {
				System.out.println("is not clicked");
			}

			Thread.sleep(3000);
			driver.quit();

		}
		@Test
		public static void doubleClick() throws InterruptedException {
			// Write a script to double click on button?================Passed
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[contains(.,'Quick')]")).click(); // Quick start
			driver.findElement(
					By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/div[1]/ul/li[2]/a/section[1]")).click(); // button
			driver.findElement(
					By.xpath("//*[@id=\"demoUI\"]/main/section/div/section/div/div/ul/li[3]/a")).click(); // double click

			WebElement satisfybutton = driver.findElement(By.xpath("//*[@id=\"btn20\"]"));
			
			Actions action=new Actions(driver);
			action.doubleClick(satisfybutton);
			
			WebElement concernButton = driver.findElement(By.xpath("//*[@id=\"btn22\"]"));
			action.doubleClick(concernButton);
			
			WebElement rating = driver.findElement(By.xpath("//*[@id=\"btn25\"]"));
			action.doubleClick(rating);
			
			Thread.sleep(3000);
			driver.quit();

		}
	
}
