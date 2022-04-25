package wschools;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class mousehover {
	
	public static void main(String[] args) {
		
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
				WebDriver driver = new ChromeDriver();
				

				// launch the browser and opening particular website  
				driver.get("https://www.python.org/");
				driver.manage().window().maximize();
				// get the title 
				//Adding wait 
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			                
			        //Instantiate Action Class        
			        Actions actions = new Actions(driver);
			        //Retrieve WebElement 'Music' to perform mouse hover 
			    	WebElement menuOption = driver.findElement(By.id("downloads"));
			    	//Mouse hover menuOption 'Music'
			    	actions.moveToElement(menuOption).perform();
			    	System.out.println("Done Mouse hover on 'Downloads' from Menu");
			    	
			    	//Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
			    	WebElement subMenuOption = driver.findElement(By.className("subnav menu")); 
			    	//Mouse hover menuOption 'All releases'
			    	actions.moveToElement(subMenuOption).perform();
			    	
			    	subMenuOption.click();
			    	System.out.println("Done Mouse hover on 'All releases' from Menu");
			    	
			    
				
		
	}

}
