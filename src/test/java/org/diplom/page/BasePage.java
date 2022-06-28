package org.diplom.page;

import org.diplom.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private final static int WAIT_TIMEOUT_SECONDS = 20;
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitVisibilityOf(WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.visibilityOf(element));
    }


    protected void waitElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitContains(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                .urlContains(text));
    }

    protected void waitContainsXpath(String locator) {
         new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(By.xpath(locator)));
    }
}
