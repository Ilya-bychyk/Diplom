package org.diplom.page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CoachPage extends BasePage {
    @FindBy (xpath = "//span[contains( text(),'14-DAY')][1]")
    private WebElement freeTrialButton;

    @Step("Click on Free Trial button")
    public void clickOnFreeTrialButton() {
        log.info("Click on Free Trial button");
        freeTrialButton.click();
        waitElementToBeClickable((WebElement) By.xpath("//button[@id='submit-btn']"));
    }

    @Step("Open Coach Page")
    public CoachPage openPage(String url) {
        log.info("Open Coach Page");
        driver.get(url);
        waitContains("coach");
        return this;
    }

    @Step("Getting url of current page")
    public String getCurrentUrl() {
        log.info("Getting url of current page");
        return driver.getCurrentUrl();
    }
}
