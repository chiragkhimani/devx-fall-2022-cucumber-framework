package com.automation.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for login page
 * 
 * @author Gibtsawit
 */
public class SearchResultPage extends BasePage {

	@FindBy(xpath = "//div[contains(@class,'codesearch-results')]//h3")
	WebElement searchResultCount;

	@FindBy(xpath = "// ul[@class='repo-list']/li//a[@class='v-align-middle']")
	List<WebElement> searchResultProjectList;

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	public boolean isSearchResultCountDispalyed() {
		return commonMethods.isDisplayed(searchResultCount);
	}

	public String getFirstProjectName() {
		return searchResultProjectList.get(0).getText();
	}

}
