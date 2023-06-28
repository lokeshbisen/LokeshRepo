package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// Tab Handling
		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();

		// get the total number of open tabs/windows
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);

		Iterator<String> abc = allWindowsID.iterator();

		String Win1 = abc.next();
		String Win2 = abc.next();

		// Print the title of parent window
		driver.switchTo().window(Win1);
		System.out.println("Parent Window Id : " + Win1); // Alphanumeric ID of Parent Window
		System.out.println(driver.getTitle()); // Title of parent window

		// Print the current Url of child tab
		Thread.sleep(2000);
		driver.switchTo().window(Win2);
		Thread.sleep(2000);
		System.out.println("Child tab Id : " + Win2); // Alphanumeric ID of child tab
		System.out.println(driver.getCurrentUrl()); // current url of child tab
		driver.close();

		// Step -2 Window/Popup Handling
		Thread.sleep(2000);
		driver.switchTo().window(Win1);
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();

		// Print the title of child window
		Set<String> allWindowsID2 = driver.getWindowHandles();
		System.out.println(allWindowsID2);
		Iterator<String> abc1 = allWindowsID2.iterator();

		String Win3 = abc1.next();
		String Win4 = abc1.next();
		Thread.sleep(2000);
		driver.switchTo().window(Win4);
		Thread.sleep(2000);
		System.out.println("Child Window Id : " + Win4); // Alphanumeric ID of Child Window
		System.out.println(driver.getTitle()); // Get title of child window
		Thread.sleep(2000);
		driver.quit();//close parent window as well as all associated window
		System.out.println("Windows popup and tab handled");
		
	}

}
