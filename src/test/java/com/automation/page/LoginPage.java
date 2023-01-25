package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="login_field")
    WebElement userNameEle;

    @FindBy(id="password")
    WebElement passwordEle;

    @FindBy(name="commit")
    WebElement signBtn;

    @FindBy(id="js-flash-container")
    WebElement errorMsg;

    public void doLogin(String username, String password) {
        userNameEle.sendKeys(username);
        passwordEle.sendKeys(password);
        signBtn.click();
    }

    public void verifyLoginPage() {
        Assert.assertTrue("Username field is not present", userNameEle.isDisplayed());
    }

    public void verifyInvalidLoginErrorMsg() {
        System.out.println(errorMsg.getText());
        Assert.assertTrue("Invalid login error is not present", errorMsg.isDisplayed());
    }
}
