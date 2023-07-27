package com.facebook.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MasterPage {
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;

	// Constructor Implementation
	public MasterPage() throws Exception {
		// Configuration properties File Implementation
		FileInputStream ip = new FileInputStream(".\\src\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// locators properties File Implementation
		FileInputStream fs = new FileInputStream(".\\src\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		// testData properties File Implementation
		FileInputStream ts = new FileInputStream(".\\src\\com\\facebook\\repository\\testData.properties");
		td = new Properties();
		td.load(ts);
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Lokesh03042023\\Lokesh\\Software\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.out.println("edge will open");
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.out.println("firefox will open");
		} else {
			System.out.println("No Browser details found");

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
}
