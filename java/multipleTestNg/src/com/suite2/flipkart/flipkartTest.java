package com.suite2.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkartTest {
	public WebDriver driver;
	// public String baseUrl = "http://www.w3schools.com/";
	String username = "";
	String password = "";

	@BeforeClass
	public void launchBorwser() {

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bhargav_mandadi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get(baseUrl);

	}

	@Test
	public void init() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.w3schools.com/");
	}

	// To log in flipkart
	@Test
	public void searchLogin() {

		WebElement search = driver.findElement(By.cssSelector("input[id='search2']"));

		boolean enable = search.isEnabled();

		if (enable == true) {

			search.click();

		}

		WebElement drop = driver.findElement(By.id("w3loginbtn"));

		drop.click();
	}

	@Test // Search For product
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

		if (pasEnable == true) {
			// sending the username to the input filed
			pass.sendKeys("Dhoni@1108");

		}
	}

	@Test
	public void submitButton() {

		WebElement login = driver.findElement(By.className("_3wIjP"));

		login.click();
	}

	@Test
	public void logout() {
		Actions s = new Actions(driver);
		WebElement user = driver.findElement(By.className("_3sUPs"));
		s.moveToElement(user).build().perform();
		driver.findElement(By.cssSelector("//button[title='Log out'")).click();
	}

	@AfterClass
	public void quit() {
		driver.close();
	}
}
