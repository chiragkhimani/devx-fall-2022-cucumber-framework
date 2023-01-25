package com.automation.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

/**
 * Page object for login page
 * 
 * @author Gibtsawit
 */
public class HomePage extends BasePage {

	@FindBy(xpath = "//a[@aria-label='Homepage']")
	WebElement pageLogo;

	@FindBy(name = "q")
	WebElement searchBox;
	
	@FindBy(xpath = "//footer//a[text()='About']")
	WebElement aboutFooterLink;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement signInBtn;


	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void openWebsite() {
		driver.get(PropertyReader.getProperty("app.baseurl"));
	}

	public boolean isPageLogoDisplayed() {
		return pageLogo.isDisplayed();
	}

	public boolean isSearchBoxIsDisplayed() {
		return searchBox.isDisplayed();
	}

	public void searchWithKeyword(String key) {
		searchBox.sendKeys(PropertyReader.getProperty(key) + Keys.ENTER);
	}

	public void clickOnAboutFooterLink() {
		aboutFooterLink.click();
	}

    public void clickSignInBtn() {
		signInBtn.click();
    }
}
