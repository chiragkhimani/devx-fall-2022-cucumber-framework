package com.automation.stepdef;

import org.junit.Assert;

import com.automation.page.AboutPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;

/**
 * Implementation of cucumber steps for login page
 * 
 * @author Gibtsawit
 */
public class AboutSteps {

	AboutPage aboutPage = new AboutPage(DriverUtils.getDriver());

	@Then("verify about page is displayed")
	public void verify_about_page_is_displayed() {
		Assert.assertTrue("About page is not displayed", aboutPage.isAboutPageLoaded());
	}
}
