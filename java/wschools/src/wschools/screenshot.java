package wschools;
import java.io.File;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class screenshot {
	
	public static void main(String[] args) {
		
		 

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
				WebDriver driver = new ChromeDriver();
				
				
				

				// launch the browser and opening particular website  
				driver.get("https://www.w3schools.com/");
				driver.manage().window().maximize();
				// get the title 
				String title = driver.getTitle();
				System.out.println("The page title is : " +title);
				
				//Call take screenshot function

		        takeSnapShot(driver, "c://test.png") ;  
		 }	
	
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}
