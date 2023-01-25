package com.automation.stepdef;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	/**
	 * This method will be executed before each scenario
	 * 
	 * @author Gibtsawit
	 */
	@Before
	public void setUpUI() {
		PropertyReader.initProperty();
		DriverUtils.createDriver();
	}

	/**
	 * This method will be executed after each scenario and we're cleaning up
	 * driver(browser)
	 * 
	 * @author Gibtsawit
	 */
	@After
	public void cleanUp() {
		DriverUtils.getDriver().quit();
	}

}
