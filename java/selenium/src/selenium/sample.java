package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class sample {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions option = new ChromeOptions();
		
		// set compatability to accept the requests form the automation tools 
		option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		WebDriver obj= new ChromeDriver(option);
		
		obj.get("https://www.redbus.in/");
		
		obj.manage().window().maximize();
	}
	
}
