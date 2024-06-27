package DateAndTimePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {

public class DatePickerTest {
	
	
    @Test
    public void testDatePicker() {
    	WebDriver driver1 = new ChromeDriver();
    	driver1.manage().window().maximize();
    	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver1.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
     	
    	driver1.get("URL_of_Your_DatePicker_Page");

        
        WebElement datePicker = driver1.findElement(By.xpath("//div[@class=\"relative flex items-center justify-between border-[1px] pe-3 border-black rounded-md mx-auto w-[300px]\"]//*[name()='svg']"));
        datePicker.click();

       
        WebElement dateToSelect = driver1.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--028 react-datepicker__day--weekend react-datepicker__day--outside-month\"]"));
        dateToSelect.click();

        
        String selectedDate = datePicker.getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);
    }

 
    }
}



