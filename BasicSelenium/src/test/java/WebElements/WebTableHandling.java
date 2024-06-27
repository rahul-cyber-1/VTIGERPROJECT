package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandling {
	@Test(priority = 1)
	public void webtable() {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		WebElement ele = d.findElement(By.xpath("//th[text()=\"SAMSUNG Galaxy\"]/../td[4]"));
		String name = ele.getText();
		System.out.println("static price : " + name);
		d.close();
	}

	@Test(priority = 2)
	public void dynamic() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
		WebElement ele = d.findElement(By.xpath("//th[text()=\"Apple iPhone\"]/../td[4]"));
		String name = ele.getText();
		System.out.println("dynamic price : " + name);

		d.close();

	}
	@Test(priority = 3)
	public void pagination() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demoapps.qspiders.com/ui/table/tablePagination");
		WebElement ele = d.findElement(By.xpath("//th[text()=\"HP Envy\"]/../td[2]"));
		String quant = ele.getText();
		d.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div[2]/ul/li[2]")).click();
		WebElement ele1 = d.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div[1]/table/tbody/tr[3]/th/../td[3]"));
		String discount = ele1.getText();
	    d.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div[2]/ul/li[3]")).click();
	    WebElement ele2 = d.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div[1]/table/tbody/tr[3]/th/../td[1]"));
		String star = ele2.getText();
	    System.out.println("quantity from pagination 1st page Hp Envy : "+ quant+ "\n" + "discount of apple from 2nd page of table : "+discount+"\n"+ "star rating from pagination page of 3rd table : "+star );
		d.close();
		
		
	}
	     @Test(priority = 4)
	     public void checkbox() {
	    	 WebDriver d = new ChromeDriver();
	 		d.manage().window().maximize();
	 		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 		d.get("https://demoapps.qspiders.com/ui/table/tableWithCheck");
	 		d.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div/table/tbody/tr[2]/td[1]/input")).click();
	 		System.out.println("check box clicked");
	 		d.findElement(By.xpath("//*[@id=\"deleteButton\"]")).click();
	 		d.findElement(By.xpath("//*[@id=\"deleteModalCheck\"]")).click();
	 		
	     }





}

