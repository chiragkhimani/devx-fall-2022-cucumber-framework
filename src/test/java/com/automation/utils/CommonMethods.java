package com.automation.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Wait method for element to be clickable
	 * 
	 * @param element
	 */
	public void waitForElementToBeClickable(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Wait method for element to be visible
	 * 
	 * @param element
	 */
	public void waitForElementToBeVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switch to newly open window
	 * 
	 * @param element
	 */
	public void switchToNewWindow(String currentWindow) {
		Set<String> windowList = driver.getWindowHandles();

		for (String window : windowList) {
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
			}
		}
	}

	/**
	 * This method used to check element is displayed or not with ignoring exception
	 * 
	 * @param element
	 */
	public boolean isDisplayed(WebElement element) {
		try {
			waitForElementToBeVisible(element);
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * This method used to click on Element ignoring exception
	 * 
	 * @param element
	 */
	public void safeClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			clickOnElementUsingJS(element);
		}
	}

	/**
	 * This method used to click on element using plain javascript
	 * 
	 * @param element
	 */
	public void clickOnElementUsingJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * This method used to pause the script for specified miliseconds
	 * 
	 * @param element
	 */
	public void pause(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String readDataFromFile(File file) {
		String content = null;
		try {
			Scanner scan = new Scanner(file);
			scan.useDelimiter("\\Z");
			content = scan.next();
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return content;
	}

}
