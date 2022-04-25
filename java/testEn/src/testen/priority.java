package testen;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priority {
	
	
	 
	public WebDriver driver;
	
	public String url ="https://www.w3schools.com/";
	
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
	}
	
	
	// get the title 
	
	@Test( groups= {"w3schools"},priority = 0)
	public void searchLogin() {
		
		WebElement search = driver.findElement(By.cssSelector("input[id='search2']"));
		
		
		
		
		boolean enable = search.isEnabled();
		
		if(enable == true) {
			
			search.click();
			
		}
		
		WebElement drop = driver.findElement(By.id("w3loginbtn"));
		
		drop.click();
	}
	
	@Test(groups= {"w3schools"}, priority = 1)
	public void loginUser() {
		
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
	}
	
	@Test(groups= {"w3schools"}, priority = 2)
	public void submitButton() {
		
		WebElement login = driver.findElement(By.className("_3wIjP"));
		
		login.click();
	}
	
	@Test(groups= {"w3schools"}, priority = 3 , alwaysRun = true)
	public void getHomeTitle() {
	
		
		String title1 = "W3Schools learning | learnign Tutorials";
		//String title = "Log in - W3Schools";
	String loginpage = driver.getTitle();
	Assert.assertEquals(loginpage, title1);
	}
	
	@AfterTest
	public void terminateBrowser() {
		
		//driver.close();
	}
}
