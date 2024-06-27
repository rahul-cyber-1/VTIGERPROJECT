package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioBtn {
@Test()
	
	
	public void radiobtn() throws InterruptedException{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		        WebElement ele = d.findElement(By.xpath("//[id=\"attended54\"]"));
		      Thread.sleep(3000);
		      ele.click();
		      boolean confirm = ele.isSelected();
		      System.out.println(confirm+ " it is selected");
		      Thread.sleep(3000);
		      JavascriptException jse = (JavascriptException) d;
		      @SuppressWarnings("unchecked")
			List<WebElement> radiobtnlist = (List<WebElement>) d.findElement(By.xpath("//input[@type=\"radio\"]"));
		  
			System.out.println(radiobtnlist.size());
		      d.close();
		     
}
}


