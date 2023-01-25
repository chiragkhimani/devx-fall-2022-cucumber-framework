package com.automation.stepdef;

import org.junit.Assert;

import com.automation.page.HomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Implementation of cucumber steps for login page
 * 
 * @author Gibtsawit
 */
public class HomeSteps {

	HomePage homePage = new HomePage(DriverUtils.getDriver());

	@Given("user open website")
	public void user_open_website() {
		homePage.openWebsite();
	}

	@Then("verify user is on home page")
	public void verify_user_is_on_home_page() {
		Assert.assertTrue("Home page is not displayed", homePage.isPageLogoDisplayed());
		Assert.assertTrue("Search box is missing from the homepage", homePage.isSearchBoxIsDisplayed());
	}

	@Then("when user search with the keyword {string}")
	public void when_user_search_with_the_keyword(String key) {
		homePage.searchWithKeyword(key);
	}

	@When("user clicks on About link from the footer")
	public void user_clicks_on_about_link_from_the_footer() {
		homePage.clickOnAboutFooterLink();
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
		homePage.clickSignInBtn();
	}


}
