package DateAndTimePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimePicker {

    @Test
    public void testTimePicker() {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
     	
    	driver.get("https://demoapps.qspiders.com/ui/timePick?sublist=0");

        // Open the time picker
        WebElement timePicker = driver.findElement(By.xpath("//a[text()='Time Picker Clock']"));
        timePicker.click();

        // Select a specific date (Example: 15th of the current month)
        WebElement timeToSelect = driver.findElement(By.xpath(" //input[@aria-invalid=\"false\"]"));
        timeToSelect.click();

        // Verify the date has been selected
        String selectedtime = timePicker.getAttribute("value");
        System.out.println("Selected time: " + selectedtime);
    }

 
    
}



