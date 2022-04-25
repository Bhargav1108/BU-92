
package testen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testEng {
	 
	public WebDriver driver ; 
	 public String baseUrl = "http://www.w3schools.com/";
	
     
  @Test
  public void launchBorwser() {
       
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);
     
  }
  
  @Test
  public void gethometitle() {
	  
	  String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
	  
  }

}

