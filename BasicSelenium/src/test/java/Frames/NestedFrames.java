package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrames {
	@Test
	public void Frames() {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]")));
		
		String email = d.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		System.out.println(email);
		
		String password = d.findElement(By.xpath("(//p[text()='Admin@1234'])[1]")).getText();
		System.out.println(password);
		
		String confirmpassword = d.findElement(By.xpath("//p[text()='Admin@1234'][2]")).getText();
		System.out.println(confirmpassword);
		
		d.switchTo().frame(d.findElement(By.xpath("/html/body/div/div/section/div[2]/iframe")));
		
	      d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		System.out.println(email);
		
		d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		System.out.println(password);
		
		 d.findElement(By.xpath("//*[@id=\"confirm-password\"]")).sendKeys(confirmpassword);
		 System.out.println(confirmpassword);
		 
		d.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();

		 
		          
	
}
}


