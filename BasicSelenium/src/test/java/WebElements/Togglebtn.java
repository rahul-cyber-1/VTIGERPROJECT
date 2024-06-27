package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Togglebtn {


	@Test
	public void togglebtn() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/toggle");
	     WebElement togglebtn = driver.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/div[2]/section[1]/aside[1]/article[2]/label/span"));
	     togglebtn.click();
		 System.out.println("toggle button clicked");
	     Thread.sleep(3000);
	     togglebtn.click();
	      System.out.println("toggle button unclicked");
	      List<WebElement> count = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	      System.out.println(count.size());
	      for(WebElement counttoggle:count) {
	    	  Thread.sleep(3000);
	    	  counttoggle.click();
	      }
	      driver.close();
	      
	}

}


