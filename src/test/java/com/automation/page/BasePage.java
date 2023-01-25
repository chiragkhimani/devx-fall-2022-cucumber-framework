package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.CommonMethods;

public abstract class BasePage {
	
	WebDriver driver;
	CommonMethods commonMethods;
	Actions action;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		commonMethods = new CommonMethods(driver);
		action = new Actions(driver);
	}

}
