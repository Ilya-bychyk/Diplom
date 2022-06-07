package org.diplom.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

@Log4j2
public class LoginPage extends BasePage {
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

    public LoginPage openPage(String url) {
        log.info("Open Login page");
        driver.get(url);
        return this;
    }

    public LoginPage fillInUsername(String userName) {
        log.info("Enter Username");
        new WebDriverWait(driver, Duration.ofMillis(20000L)).until(ExpectedConditions.elementToBeClickable(username));
        username.clear();
        username.sendKeys(userName);
        return this;
    }

    public LoginPage fillPassword(String keyPassword) {
        log.info("Enter Password");
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    public void clickLoginButton() {
        log.info("Click on login button");
        loginButton.click();
    }

    public LoginPage clickCheckbox() {
        log.info("Deselect checkbox Remember me");
        if (checkboxIsSelected) {
            checkbox.click();
        }
        return this;
    }
}
