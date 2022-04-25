package wschools;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// launch the browser and opening particular website  
		driver.get("https://demoqa.com/select-menu/");
		driver.manage().window().maximize();
		// get the title 
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
					
		// Select the option by index
		se.selectByIndex(3);
		// Select the option by value
		se.selectByValue("6");
		
		// Select the option using the visible text
		se.selectByVisibleText("White");
		
		Select oSel = new Select(driver.findElement(By.xpath("//*[@id='cars']")));

				if(oSel.isMultiple()){
					
					//Selecting multiple values by index
					oSel.selectByIndex(1);
					oSel.selectByIndex(2);

					//Or selecting by values
					oSel.selectByValue("volvo");
					oSel.selectByValue("audi");

					//Or selecting by visible text
					oSel.selectByVisibleText("Volvo");
					oSel.selectByVisibleText("Opel");
				}
				Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		        
				// Get all the options of the dropdown
				List<WebElement> options = select.getOptions();

		        
				// Get all the selected option of the dropdown
				List<WebElement> selectedOptions = select.getAllSelectedOptions();
		oSel.deselectAll();
	}
}
