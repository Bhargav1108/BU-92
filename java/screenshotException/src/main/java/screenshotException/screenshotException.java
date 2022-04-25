package screenshotException;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class screenshotException {	
		public static void main(String[] args) {
			
			 

					System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
					WebDriver driver = new ChromeDriver();
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					
					
					

					// launch the browser and opening particular website  
					driver.get("https://www.w3schools.com/");
					driver.manage().window().maximize();
					// get the title 
					
					String title = driver.getTitle();
					System.out.println("The page title is : " +title);
					
					//Call take screenshot function
					
					// here we can use try catch block to handle the exceptions
					
			        try {
			        	
						takeSnapShot(driver, "C:\\Users\\bhargav_mandadi\\Desktop\\Training\\test.png") ;
						
					} catch (Exception e) {
						
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}  
			        
			        
			      //Fetching the Domain Name of the site. Tostring() change object to name.		
			        String DomainName = js.executeScript("return document.domain;").toString();
			        
			        System.out.println("Domain name of the site = "+DomainName);					
			          		
			        //Fetching the URL of the site. Tostring() change object to name		
			        String url = js.executeScript("return document.URL;").toString();			
			        System.out.println("URL of the site = "+url);					
			          		
			       //Method document.title fetch the Title name of the site. Tostring() change object to name		
			       String TitleName = js.executeScript("return document.title;").toString();			
			       System.out.println("Title of the page = "+TitleName);					

			        		
			      //Navigate to new Page i.e to generate access page. (launch new url)	
			       
			      js.executeScript("window.location = 'https://www.python.org/'");	
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
