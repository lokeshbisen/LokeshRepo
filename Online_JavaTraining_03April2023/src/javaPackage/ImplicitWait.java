package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver",
						"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement( By.xpath("//textarea[@name='q']")).sendKeys("How Stuff Works");
				
				//Handling Auto Suggestions
				List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role ='listbox']/li"));
				for(int i=0;i<AllSuggestions.size();i++) {
					String expResult = "how stuff works quiz";
					if(AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)){
						AllSuggestions.get(i).click();
						break;
						
					}
					
				}
				
				
				
				

	}

}
