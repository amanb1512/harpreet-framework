package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://www.facebook.com");
	
 	WebElement day =  driver.findElement(By.id("day"));
		
 	WebElement month = driver.findElement(By.id("month"));
 	
    WebElement year = driver.findElement(By.id("year"));
    
 //   Select select1 = new Select(day);
    
  //  select1.selectByVisibleText("20");
    
  //  Select select2 = new Select(month);
  //  select2.selectByVisibleText("Sep");
    
    //  Select select3 = new Select(year);
  //  select3.selectByVisibleText("2015"); 
    
    String dob =   "30-Jan-2011";
    
  String dobVal[] = dob.trim().split("-");
    
   
   selectDropdownvalue (day,dobVal[0]);
   
  selectDropdownvalue (month,dobVal[1]);
  
  selectDropdownvalue(year,dobVal[2]);
  
	}
    public static void selectDropdownvalue(WebElement element, String value ) {
    
    	Select select  = new Select(element);
    	
    	select.selectByVisibleText(value);
    }

	}


