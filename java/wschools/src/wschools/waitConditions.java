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



public class waitConditions {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// launch the browser and opening particular website  
		driver.get("https://demoqa.com/alerts/");
		driver.manage().window().maximize();
		// get the title 
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		// Click on the Button "Timing Alert"

        driver.findElement(By.id("alertButton")).click();

        Alert alert = driver.switchTo().alert();
        
        // It should acceping the pop means it has click on the ok 
        alert.accept();
        
       driver.findElement(By.id("promtButton")).click();

        alert.sendKeys("This is specialization Training");
        
        alert.accept();
        //it dismiss the pop-up
        
        
        driver.findElement(By.id("item-0")).click();
       
        //
        driver.findElement(By.id("windowButton")).click();
        
        String mainwindow = driver.getWindowHandle();
        
        driver.switchTo().window(mainwindow);
        
      
        
        
        
        
		
		
		
		
	}
}
