package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//Enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		
		//Fetch input box attribute value
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		
		//Get height of the input box
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		
		//Get width of the input box
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		
		//Use ExplicitWait to check if password field is visible
		WebDriverWait wt = new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
		
		
		

	}

}
