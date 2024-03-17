package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import pageObjects.LoginPage;
import pageObjects.createProject;

public class Baseclass {

	public static WebDriver driver;
	public static constantValues constantValues;
	public static Wait<WebDriver> wait;
	public static createProject CP;

	static long timeduration = constantValues.implict_timeduration;
	static int explicit_timeduration = constantValues.explicit_timeduration;

	Random random = new Random();
	int randomNumber = new Random().nextInt(1000);
	protected String randomNumberString = String.valueOf(randomNumber);
	String screenshotpath = "C:\\Users\\aswin.moorthy\\Automation\\pharma_NLP\\screenshot\\" + "PNLP_"
			+ randomNumberString + ".png";

	public void takeScreenshot() {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, new File(screenshotpath));
			System.out.println("Screenshot saved: ");
		} catch (IOException e) {
			System.err.println("Failed to save screenshot: " + e.getMessage());
		}
	}

	public void isLoggedIn() throws InterruptedException {
		String Actual = constantValues.default_Url;
		Thread.sleep(5000);
		String CurrentUrl = driver.getCurrentUrl();

		Assert.assertEquals(Actual, CurrentUrl);
		System.out.println(CurrentUrl);
	}

	public static void implictwait() {
		driver.manage().timeouts().implicitlyWait(timeduration, TimeUnit.SECONDS);

	}

	public static void explicitwait() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicit_timeduration));

	}

	public void toaster() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Project added successfully']")));
		String expectedMessage = "Project added successfully";
		WebElement toasterMessage = driver.findElement(By.xpath("//p[text()='Project added successfully']"));
		String actualMessage = toasterMessage.getText();
		assert actualMessage.equals(expectedMessage);

	}

	
	public static void validateToasterMessage(WebDriver driver, WebElement toasterElement, String expectedMessage) {
		// Wait for the toaster popup to appear
		wait.until(ExpectedConditions.visibilityOf(toasterElement));

		// Get the actual message text
		String actualMessage = toasterElement.getText();

		// Assert the toaster message
		assert actualMessage.equals(expectedMessage) : "Toaster message doesn't match expected";
	}

}
