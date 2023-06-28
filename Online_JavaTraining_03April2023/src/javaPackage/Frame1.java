package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com//");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// Find total number of frames present
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames : " + allFrames);

		// Go inside each frame and check if the element is present

		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'close')]")).click();

		}

	}

}
