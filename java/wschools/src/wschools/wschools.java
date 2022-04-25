package wschools;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class wschools {
	
	public static void main(String[] args) {
		
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
				WebDriver driver = new ChromeDriver();
				
				
				

				// launch the browser and opening particular website  
				driver.get("https://www.w3schools.com/");
				driver.manage().window().maximize();
				// get the title 
				String title = driver.getTitle();
				System.out.println("The page title is : " +title);
				
				
				WebElement search = driver.findElement(By.cssSelector("input[id='search2']"));
				
				
				
				
				boolean enable = search.isEnabled();
				
				if(enable == true) {
					
					search.click();
					
				}
				
				WebElement drop = driver.findElement(By.id("w3loginbtn"));
				
				drop.click();
				
				// navigate the browser to back and forward 
				
				driver.navigate().back();
				
				driver.navigate().forward();
				
				// Find the username input field using id
				
				WebElement usrName = driver.findElement(By.id("modalusername"));
				
				// chekcing whehter the username has displayed or not 
				usrName.isDisplayed();
				
			    // sending the username to the input filed 
				
				usrName.sendKeys("mandadi448@gmail.com");
				
				
				// Find the password input field using id
				
				WebElement pass = driver.findElement(By.id("current-password"));
				
				boolean pasEnable = pass.isEnabled();
				
				if( pasEnable == true ) {
				// sending the username to the input filed 
				pass.sendKeys("Dhoni@1108");
				
				}
				
				WebElement login = driver.findElement(By.className("_3wIjP"));
				
				login.click();
				
				String homepage = driver.getTitle();
				System.out.println("The page title is : " +homepage);
				
				
				// to close the current tab opened on the browser
				
				
				
		
	}

}
