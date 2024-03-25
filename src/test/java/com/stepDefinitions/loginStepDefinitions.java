package com.stepDefinitions;

import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.Baseclass;
import com.utils.ExcelReader;
import com.utils.loadProperties;

import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class loginStepDefinitions extends Baseclass {

	public static LoginPage login;
	public static ExcelReader Excel;
	Object[][] objectArray;

	@When("User enters the credentials in the email and password textbox then Project page should be displayed")
	public void Login() throws Throwable {
		login = new LoginPage(driver);
		Excel = new ExcelReader();

		//Excel Value passing
		objectArray = Excel.getTestData();
		String username = (String) objectArray[0][0];
		String password = (String) objectArray[0][1];

		System.out.println("&&&&&&&&&&&&&&&&&&&&"+username);
		System.out.println("&&&&&&&&&&&&&&&&&&&&"+password);
		login.getUsername().sendKeys(username);
		login.getPassword().sendKeys(password);
		login.getLoginbtn().click();
		
		takeScreenshot();

	}

	@When("User validate the valid credentials then use successfully login to application")
	public void validateloginSuccessfull() throws InterruptedException {
		isLoggedIn();
		takeScreenshot();

	}

}
