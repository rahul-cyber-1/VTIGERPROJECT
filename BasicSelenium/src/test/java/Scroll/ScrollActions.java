package Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ScrollActions {
	
	  
	    @Test
	    public void testScrollPage() throws InterruptedException {
	    	
		    WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
	     	
	    	
	      
	        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
	       

	        
	        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
	        

	       
	        WebElement element = driver.findElement(By.xpath("//section[@class=\"flex justify-center py-20 w-full\"]"));
	        element.click();
	       
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	      
	    
}
}
