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

	public class fileupload {	
		public static void main(String[] args) throws NoSuchElementException {
			
			 

					System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
					WebDriver driver = new ChromeDriver();				
					

					// launch the browser and opening particular website  
					
					 String baseUrl = "http://demo.guru99.com/test/upload/";
					 
					 driver.get(baseUrl);
					 
					driver.manage().window().maximize();
					// get the title 
				
					
					WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

			        // enter the file path onto the file-selection input field
			        uploadElement.sendKeys("C:\\Users\\bhargav_mandadi\\Desktop\\Training\\Error.html");
			        
			        System.out.println("File uploaded");

			        // check the "I accept the terms of service" check box
			        driver.findElement(By.id("terms")).click();

			        // click the "UploadFile" button
			        driver.findElement(By.name("send")).click();
			        
			        WebElement res = driver.findElement(By.id("res"));
			        
			        System.out.println(res.getText());
			        
			        
			        

    }
	}
