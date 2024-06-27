package KeyboardActions;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardActions {

	   @Test
	    public void KeyboardActions1(){
	       
	    	WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		   
	        WebElement inputElement = driver.findElement(By.id("[id=\"email\"]")); 
	        
	        inputElement.click();

	      
	        Actions actions = new Actions(driver);

	       
	        actions.click(inputElement).perform();

	       
	        actions.sendKeys("Hello, World!").perform();
	        

	      
	        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        

	        
	        actions.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
	        

	       
	        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	        

	     
	        actions.sendKeys(Keys.BACK_SPACE).perform();
	        
	    }


}
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


