package javaPackage;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {

	@Test
	public void testCase1() {

		String expectedText = "Facebook helps you connect and share with the people in your life.";

		System.setProperty("webdriver.chrome.driver",
				"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		String actualText = driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).getText();

		// Equal Assertion
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Equal Assertion pass");

		// False Assertion
		Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).isSelected());
		System.out.println("False assertion verified");

		// True Assertion
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).isDisplayed());
		System.out.println("True assertion verified");
	}

}
