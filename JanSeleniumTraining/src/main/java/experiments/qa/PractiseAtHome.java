package experiments.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseAtHome {

	public static void main(String[] args)  {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	

	
 driver.findElement(By.name("firstname")).sendKeys("harpreet");

 
 driver.findElement(By.name("lastname")).sendKeys("Singh");
 
 driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @id= 'u_0_k']")).sendKeys("harpreet1215@gmail.com");
 


 
 driver.findElement(By.xpath("//input[@type= 'password' and @autocomplete= 'new-password' ]")).sendKeys("test@123");
 
 
 
 WebElement month = driver.findElement(By.id("month"));
 
 WebElement day =   driver.findElement(By.id("day"));
 
 
 WebElement year = driver.findElement(By.id("year"));
 
 
 Select select1 = new Select(month);
 
 select1.selectByVisibleText("Aug");
 
 
 Select select2 = new Select(day);
 select2.selectByVisibleText("15");
 
 Select select3 = new Select (year) ;
 
select3.selectByVisibleText("1988");


 driver.findElement(By.xpath("//input[@type = 'radio' and @value = '2']")).click();
 
 
 
 
 
 
 
 
 
 
	}

}
