package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		//Switching Frame
		driver.switchTo().frame(0);
		System.out.println("Switched to frame");
		
		//Draggable WebElement
		WebElement drag = driver.findElement(By.id("draggable"));
		
		
		
		//Drag and Drop using Actions class
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag,100,60).build().perform();
		
		//Drag the WebElement and click and hold using coordinates
		Thread.sleep(2000);
		act.clickAndHold(drag).dragAndDropBy(drag, 100, 60).build().perform();
		

	}

}
