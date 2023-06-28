package javaPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogging {

	public static void main(String[] args) {
		//Create Logger Instance
		Logger logger = Logger.getLogger("Log4jLogging");
		
		//Configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\ADMIN\\eclipse-workspace\\Online_JavaTraining_03April2023\\log4j.properties");
		
		//Open browser Instance
				System.setProperty("webdriver.chrome.driver",
						"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				logger.info("chrome browser instance opened");
				
				//Maximize the window
				driver.manage().window().maximize();
				logger.info("window maximized");
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				logger.info("Implicit wait given");
				
				//Open URL
				driver.get("https://www.facebook.com/");
				logger.info("Application opened");
				
				
				try {
					driver.findElement(By.id("emails")).isDisplayed();
					logger.info("Web Element Displayed");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					logger.info("Failure - Web Element is not Displayed");
				}
				
		

	}

}
