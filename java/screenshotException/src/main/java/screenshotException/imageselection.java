package screenshotException;

	import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class imageselection {	
		public static void main(String[] args) throws NoSuchElementException {
			
			 

					System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
					WebDriver driver = new ChromeDriver();				
					

					// launch the browser and opening particular website  
					
					driver.get("https://www.w3schools.com/");
					
					//driver.get("https://www.python.org/");
					driver.manage().window().maximize();
					// get the title 
				
					
					String title = driver.getTitle();
					System.out.println("The page title is : " +title);
					
					try {
						
						driver.findElement(By.cssSelector("a[title=\"Home\"]")).click();
						
						}
						catch(Exception e) {
							e.printStackTrace();
						}
					
					//driver.findElement(By.cssSelector("img[class=\"python-logo\"]")).click();					

					//verify that we are now back on Facebook's homepage		
					if (driver.getTitle().equals("W3Schools Online Web Tutorials")) {	
						
		            System.out.println("We are in w3 schools home page");					
					} 
					else {			
		        	
		            System.out.println("We are not in w3schools home page");					
		        }	

    }
	}
