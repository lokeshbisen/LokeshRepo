package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();

		// Open URL using get method
		driver.get("https://www.facebook.com");

		// Maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();

		// Delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// Open URL using navigate method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");

		// Refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();

		// Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();

		// Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();

		// Fetch the current URL
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

		// Get title of the web page
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		// Close the browser
		driver.close();

	}

}
