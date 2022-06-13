package org.diplom.page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

//import  org.diplom.utils.StringConstants.URL_LOGIN_PAGE;
@Log4j2
public class LoginPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(LoginPage.class);
    boolean checkboxIsSelected = true;

    @FindBy(xpath = "//input[@id='navbar_username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='navbar_password']")
    private WebElement password;

    @FindBy(xpath = "//input[@class='loginblueButton1']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@name='cookieuser']")
    private WebElement checkbox;

    @FindBy(xpath = "//div[@id='invalidpassworderrormessage']")
    private WebElement errorMessage;

    @Step("Opening Login Page URl")
    public LoginPage openPage(String url) {
        log.info("Open Login page");
        driver.get(url);
        return this;
    }

    @Step("Fill username Field")
    public LoginPage fillInUsername(String userName) {
        log.info("Enter Username");
        new WebDriverWait(driver, Duration.ofMillis(20000L)).until(ExpectedConditions.elementToBeClickable(username));
        username.clear();
        username.sendKeys(userName);
        return this;
    }

    @Step("Fill password Field")
    public LoginPage fillPassword(String keyPassword) {
        log.info("Enter Password");
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    @Step("Click on Login button")
    public void clickLoginButton() {
        log.info("Click on login button");
        loginButton.click();
    }

    @Step("Click checkbox Remember me")
    public LoginPage clickCheckbox() {
        log.info("Deselect checkbox Remember me");
        if (checkboxIsSelected) {
            checkbox.click();
        }
        return this;
    }
}
