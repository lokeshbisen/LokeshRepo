package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@id, 'u_0')]")).click();
		Thread.sleep(2000);

		// 1st Way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dropdown values : " + birthMonth.size());
		birthMonth.get(8).click(); // Sep

		// 2nd Way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr"); // Apr
		Thread.sleep(2000);
		month.selectByValue("12"); // Dec
		Thread.sleep(2000);
		month.selectByIndex(7); // Aug
		System.out.println(month.getFirstSelectedOption().getText()); // Aug - Current Selected Value

		// 3rd Way
		List<WebElement> dropdown = month.getOptions();
		for (int i = 0; i < dropdown.size(); i++) {
			if (dropdown.get(i).getText().equalsIgnoreCase("Sep")) {
				dropdown.get(i).click();
			}
		}

		// 4th way
		bm.sendKeys("Jun");
		
		//5th Way
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
		
		//Check if dropdown select multi selection
		System.out.println(month.isMultiple()); //false
		month.selectByVisibleText("Apr"); // Apr
		month.selectByValue("12"); // Dec
		month.selectByIndex(7); // Aug
		
		//Deselect the multi selected values
		month.deselectByVisibleText("Apr"); // Apr
		month.deselectByValue("12"); // Dec
		month.deselectByIndex(7); // Aug
		month.deselectAll();
		

	}

}
