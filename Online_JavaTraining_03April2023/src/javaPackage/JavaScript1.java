package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver",
						"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com");
				
				//JavascriptExecutor
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				
				//Locate WebElement using Javascript
				jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
				jse.executeScript("document.getElementById('pass').value='123abc'");
				
				//Scroll Down using JavaScript
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0,400)");
				
				//Scroll Up using JavaScript
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0,-400)");
				

	}

}
