package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@id, 'u_0')]")).click();

		// 1st way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click(); // Female
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click(); // Male
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click(); // Custom

		// 2nd Way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radio buttons : " + radios.size());
		System.out.println(radios.get(0).isSelected()); // false
		System.out.println(radios.get(1).isEnabled()); // true
		System.out.println(radios.get(1).isDisplayed()); // true
		Thread.sleep(2000);
		radios.get(1).click(); // Male
		Thread.sleep(2000);
		System.out.println(radios.get(2).isSelected()); // false

		// 3rd Way (Industry preferred)
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total radio buttons : " + radios1.size());
		String expResult = "Female";
		for (int i = 0; i < radios1.size(); i++) {
			if (radios1.get(i).getText().equalsIgnoreCase(expResult)) {
				radios1.get(i).click();
				System.out.println(expResult + "Clicked");
				break;
			}

		}

	}

}
