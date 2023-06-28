package javaPackage;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver",
						"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://demoqa.com/alerts");
				
				//Alert Handling 
				Thread.sleep(2000);
				driver.findElement(By.id("confirmButton")).click();
				Thread.sleep(2000);
				
				//Verify Alert Text
				String alertText = driver.switchTo().alert().getText();
				String expAlertText = "Do you confirm action?";
				Assert.assertEquals(alertText, expAlertText);
				System.out.println("Alert text verified");
				
				//Accept the Alert
				driver.switchTo().alert().accept();
				System.out.println("Alert acdepted");
				
				//Dismiss the Alert
				driver.findElement(By.id("confirmButton")).click();
				driver.switchTo().alert().accept();
				System.out.println("Alert dismissed");
				
				

	}

}
