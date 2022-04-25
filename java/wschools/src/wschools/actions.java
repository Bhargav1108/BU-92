package wschools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 // Create a new instance of the Chrome driver
		   WebDriver driver = new ChromeDriver();

		   // Launch the URL 
		   driver.get("https://demoqa.com/buttons");
		   System.out.println("demoqa webpage displayed");
			
		   //Maximise browser window
		   driver.manage().window().maximize();
			 
		   //Instantiate Action Class
		   Actions actions = new Actions(driver);
			 
		   //Retrieve WebElement to perform right click
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
			 
		   //Right Click the button to display Context Menu&nbsp;
		   actions.contextClick(btnElement).perform();
		   System.out.println("Right click Context Menu displayed");
		   
		   btnElement = driver.findElement(By.id("doubleClickBtn")); 
			
			//Double Click the button 
			actions.doubleClick(btnElement).perform(); 
			
			System.out.println("Button is double clicked"); 
			
			//Following code just click on OK button on alert , this differs 
			//depending upon application(under test) specific test case  
			// Accept the Alert  
			driver.switchTo().alert().accept(); 
			System.out.println("Double click Alert Accepted");

		   //Select and click 'Copy me' i.e. 2nd option in Context menu 
		   WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightClickBtn']/div[1]"));  
		   elementOpen.click(); 
			 
		   // Accept the Alert 
		   driver.switchTo().alert().accept();
		   System.out.println("Right click Alert Accepted");
	}

}
