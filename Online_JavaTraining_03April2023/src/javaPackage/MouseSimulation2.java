package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver",
						"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://jqueryui.com/droppable/");
				
				//Switching Frame
				driver.switchTo().frame(0);
				System.out.println("Switched to frame");
				
				//Draggable WebElement
				WebElement drag = driver.findElement(By.id("draggable"));
				
				//Droppable WebElement
				WebElement drop = driver.findElement(By.id("droppable"));
				
				//Drag and Drop using Actions class
				Thread.sleep(2000);
				
				Actions act = new Actions(driver);
				act.dragAndDrop(drag, drop).build().perform();
				
				
				

	}

}
