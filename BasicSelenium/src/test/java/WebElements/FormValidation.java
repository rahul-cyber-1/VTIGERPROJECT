package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormValidation {
	@Test
	public void formvalidation() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
    	driver.findElement(By.name("requiredfield")).sendKeys("abcde");
    	
    	driver.findElement(By.name("password")).sendKeys("apple123");
    	driver.findElement(By.name("confirmpass")).sendKeys("apple123");
    	driver.findElement(By.name("email")).sendKeys("tekpyramid@gmail.com");
    	driver.findElement(By.name("minLength")).sendKeys("icct20worldcup2024");
    	driver.findElement(By.name("maxLength")).sendKeys("INDIA");
    
    	driver.findElement(By.xpath( "//input[@placeholder=\"Enter only digits\"]")).sendKeys("0123456789");
    	driver.findElement(By.xpath( "//input[@placeholder=\"Enter only numbers\"]")).sendKeys("1233656776");
    	driver.findElement(By.name("rangeLength")).sendKeys("murtuza");
    	driver.findElement(By.name("alphanum")).sendKeys("abcde123365");
    	driver.findElement(By.name( "minValue")).sendKeys("1233656776");
    	driver.findElement(By.name( "maxValue")).sendKeys("6");
    	driver.findElement(By.name("rangeValue")).sendKeys("7");
    	driver.findElement(By.name("url")).sendKeys("https://demoapps.qspiders.com/ui");
    	driver.findElement(By.xpath("//button[text()='Submit']")).click();
    	Thread.sleep(3000);
    	driver.close();

    	
     	
	}
	
	
	
	
	

}
