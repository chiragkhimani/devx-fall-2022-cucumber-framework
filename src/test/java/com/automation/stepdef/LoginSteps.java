package com.automation.stepdef;

import com.automation.page.LoginPage;
import com.automation.utils.DriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverUtils.getDriver());

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        loginPage.verifyLoginPage();
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        loginPage.doLogin(username, password);
    }

    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {
        loginPage.verifyInvalidLoginErrorMsg();
    }
}
