package com.automation.stepdef;

import org.junit.Assert;

import com.automation.page.SearchResultPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.en.Then;

/**
 * Implementation of cucumber steps for login page
 * 
 * @author Gibtsawit
 */
public class SearchResultSteps {

	SearchResultPage searchResultPage = new SearchResultPage(DriverUtils.getDriver());

	@Then("verify search result count displayed on the page")
	public void verify_search_result_count_displayed_on_the_page() {
		Assert.assertTrue("Search result count is not displayed on the page",
				searchResultPage.isSearchResultCountDispalyed());
	}

	@Then("verify search result has a first project {string}")
	public void verify_search_result_has_first_project(String key) {
		Assert.assertTrue("Search result project name " + searchResultPage.getFirstProjectName(),
				searchResultPage.getFirstProjectName().equals(PropertyReader.getProperty(key)));
	}

}
