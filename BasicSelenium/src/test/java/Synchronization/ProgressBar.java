package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ProgressBar {
	   @Test
	    public void implicit() {
	   	 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui/progress");
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			 WebElement startbtn = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[normalize-space()='Start']"))));
			startbtn.click();
			
	    }}


