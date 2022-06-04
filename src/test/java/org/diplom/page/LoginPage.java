package org.diplom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        private WebElement ErrorMessage;

    public LoginPage openPage(String url) {
            driver.get(url);
            return this;
        }

        public LoginPage fillInUsername(String userName) {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(username));
            username.clear();
            username.sendKeys(userName);
            return this;
        }

        public LoginPage fillPassword(String keyPassword) {
            password.clear();
            password.sendKeys(keyPassword);
            return this;
        }

        public void clickLoginButton() {
            loginButton.click();
        }

        public LoginPage clickCheckbox() {
        if (checkboxIsSelected = true) {
            checkbox.click();
        }
        return this;
        }

    public String getErrorMessageText() {
        return ErrorMessage.getText();
    }
    }
