package com.facebook.genericPage;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();

	}

	// get text of web Element
	public void getWebElementText(String xpathKey) {
		String getTextOfWebElement = driver.findElement(By.xpath(or.getProperty(xpathKey))).getText();
		System.out.println(getTextOfWebElement);
	}

	// Click Method
	public void click(String xpathKey) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).click();

	}

	// Enter Method
	public void enterData(String xpathKey, String testData) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).sendKeys(td.getProperty(testData));

	}

	// Clear Data
	public void enterData(String xpathKey) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).clear();

	}
	// Mouse Hover
		public void moveToElement(String xpathKey) {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathKey)))).build().perform();

		}

		//Click List of Web Element
		//Select Dropdown Value using Visible Text
		//Reading Excel Data
}
