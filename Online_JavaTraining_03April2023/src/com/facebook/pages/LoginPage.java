package com.facebook.pages;

import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws Exception {
		super();

	}

	// click email
	public void clickEmail() {
		click("EmailOrPhone");
	}

	// get Text
	public void getfacebookText() {
		getWebElementText("FacebookText");
	}
	
	//Enter Email
	public void enterEmail() {
		enterData("EmailOrPhone", "testData1");
	}
	// click password
		public void clickPassword() {
			click("Password");
		}
	
		//Enter Password
		public void enterPassword() {
			enterData("Password", "testData2");
		}
		
		// click login button
		public void clickLoginButton() {
			click("LoginButton");
		}
}
