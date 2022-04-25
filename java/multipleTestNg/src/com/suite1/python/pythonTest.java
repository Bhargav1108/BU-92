package com.suite1.python;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pythonTest {
	public WebDriver driver;
	public String baseUrl = "http://www.w3schools.com/";

	@BeforeClass
	public void launchBorwser() {

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority=0)
	public void init() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.python.org/");
	}
	
	@Test(priority=1)
	public void community() {
		
		WebElement ele = driver.findElement(By.id("community"));
		ele.click();
	}
	
	@AfterClass
	public void quit() {
		
		driver.close();
	}
	
}
