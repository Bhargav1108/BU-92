package wschools;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class iframes {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		
		
         
         //navigate to url
         driver.get("https://demoqa.com/frames");
         
         //Locate the frame1 heading
         //Locating frame1 using its id
         WebElement frame1=driver.findElement(By.id("frame1"));
         driver.switchTo().frame(frame1);
         //Identifying the heading in webelement
         WebElement frame1Heading= driver.findElement(By.id("sampleHeading"));
         
         //Finding the text of the heading
         String frame1Text=frame1Heading.getText();
         
         //Print the heading text
         System.out.println(frame1Text);
         
       //Find the total number of iframes on the page
         int totalIFramesOnPage=driver.findElements(By.tagName("iframe")).size();
         
         //Print the total iframes on page
         System.out.println("Total iframes on Page:"+totalIFramesOnPage);
         
         //switch to first frame using index=0
         driver.switchTo().frame(0); 
         
         
         int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
         System.out.println("Number of Frames on a Page:" + countIframesInPage);
         
         //Locate the frame1 on the webPage
         WebElement frame2=driver.findElement(By.id("frame1"));
         
         //Switch to Frame1
         driver.switchTo().frame(frame1);
         
         //Locate the Element inside the Frame1
         WebElement frame2Element= driver.findElement(By.tagName("body"));
         
         //Get the text for frame1 element
         String frame2Text=frame2Element.getText();
         System.out.println("Frame1 is :"+frame2Text);
         
         //Number of Frames on a Frame1
         int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
         System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
         
         //switch to child frame
         driver.switchTo().frame(0);
         
         int countIframesInFrame2 =driver.findElements(By.tagName("iframe")).size();
         System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
        	
		
		
	}
}
