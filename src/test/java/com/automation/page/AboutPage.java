package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

/**
 * Page object for login page
 * 
 * @author Gibtsawit
 */
public class AboutPage extends BasePage {

	@FindBy(xpath = "//h1[contains(text(),\"Let's build from here\")]")
	WebElement aboutPageTitle;

	public AboutPage(WebDriver driver) {
		super(driver);
	}

	public boolean isAboutPageLoaded() {
		boolean isPageTitleDisplayed = commonMethods.isDisplayed(aboutPageTitle);
		boolean isUrlUpdated = driver.getCurrentUrl().contains(PropertyReader.getProperty("about.page.url"));
		return isPageTitleDisplayed && isUrlUpdated;
	}

}
